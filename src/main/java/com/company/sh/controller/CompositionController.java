package com.company.sh.controller;

import com.company.sh.service.CompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ("/songs")
public class CompositionController {
    @Autowired
    private CompositionService compositionService;

    @RequestMapping(method = RequestMethod.GET)
    public String getMovies(Model model) {
        List<Film> films = filmService.getAll();
        model.addAttribute("films", films);
        return "allFilms";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(@PathVariable Long id, Model model) {
        Film film = filmService.findById(id);
        if (Objects.isNull(film)) {
            log.error("Film not found. ID: {}", id);
//            throw new IllegalArgumentException(String.format("Film with received ID [%d] not found", id));
        }
        model.addAttribute("film", film);
        return "selectedFilm";
    }

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    public String findByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date from,
                             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable(required = false) Date to, Model model) {
        to = Objects.isNull(to) ? new Date() : to;
        List<Film> films = filmService.findByDate(from, to);
        model.addAttribute("films", films);
        return "forms";
    }

    @RequestMapping(value = "/director/{id}/date", method = RequestMethod.GET)
    public String findByDirectorAndDate(@PathVariable @RequestParam("id") Long id,
                                        @RequestParam(required = false)
                                        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date from,
                                        @RequestParam(required = false)
                                        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date to, Model model) {
        to = Objects.isNull(to) ? new Date() : to;
        List<Film> films = filmService.findByDirectorAndDate(id, from, to);
        model.addAttribute("films", films);
        return "form_test";
    }

    @RequestMapping(value = "/filmsById&Date", method = RequestMethod.GET)
    public String form_test() {
        return "form_test";
    }


    @RequestMapping(value = "/filmsByDate", method = RequestMethod.GET)
    public String getFilms() {
        return "forms";
    }

}

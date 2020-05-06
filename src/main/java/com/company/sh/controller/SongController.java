package com.company.sh.controller;

import com.company.sh.model.Song;
import com.company.sh.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping ("/songs")
public class SongController {
   
    @Autowired
    private SongService songService;

    @RequestMapping(method = RequestMethod.GET)
    public String getSongs(Model model) {
        List<Song> songs = songService.getAllSongs();
        model.addAttribute("songs", songs);
        return "allSongs";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(@PathVariable Integer id, Model model) {
       Song song= songService.findSong(id);
        model.addAttribute("song", song);
        return "selectedSong";
    }
    @RequestMapping(value = "/singer", method = RequestMethod.GET)
    public String findBySinger(@PathVariable @RequestParam("id") Integer id,Model model) {
        List<Song> songs = (List<Song>) songService.findSongBySingerId(id);
        model.addAttribute("songs", songs);
        return "result";
    }
    @RequestMapping(value = "/songsBySinger", method = RequestMethod.GET)
    public String getSongs() {
        return "result";
    }
}

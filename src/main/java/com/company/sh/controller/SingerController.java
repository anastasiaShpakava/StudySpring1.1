package com.company.sh.controller;

import com.company.sh.model.Singer;
import com.company.sh.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;



@Controller
@RequestMapping ("/singers")
public class SingerController {

    @Autowired
    private SingerService singerService;

    @RequestMapping (method = RequestMethod.GET)
    public String getSingers(Model model) {
        List<Singer> singers = singerService.getAllSingers();
        model.addAttribute("singers", singers);
        return "singers";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getSinger (@PathVariable Integer id, Model model) {
      Singer singer = singerService.findSinger(id);
       model.addAttribute("singer", singer);
        return "singer";
    }
}

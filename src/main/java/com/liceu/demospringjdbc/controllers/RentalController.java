package com.liceu.demospringjdbc.controllers;

import com.liceu.demospringjdbc.entities.Film;
import com.liceu.demospringjdbc.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RentalController {
    @Autowired
    FilmService filmService;

    @GetMapping("/rental")
    public String rental(Model model) {
        List<Film> films = filmService.findAll();
        model.addAttribute("films", films);
        return "rental";
    }


}

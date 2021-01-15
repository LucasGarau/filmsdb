package com.liceu.demospringjdbc.controllers;

import com.liceu.demospringjdbc.entities.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RentController {

  @GetMapping("/rent")
  public String greetingForm(Model model) {
    model.addAttribute("greeting", new Greeting());
    return "rent";
  }

  @PostMapping("/rent")
  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    model.addAttribute("greeting", greeting);
    return "result";
  }

}
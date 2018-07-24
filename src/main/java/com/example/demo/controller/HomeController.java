package com.example.demo.controller;

import com.example.demo.model.Kisi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "home";
    }

    @GetMapping(path = "genel/{id}")
    public String genel(@PathVariable String id, Model model) {
        return "genel";
    }

    @GetMapping(path = "bireysel/{id}")
    public String bireysel(@PathVariable String id, Model model) {
        return "bireysel";
    }

    @GetMapping(path = "profil/{id}")
    public String profil(@PathVariable String id, Model model) {
        return "profil";
    }


}

package com.example.demo.controller;

import com.example.demo.model.Kisi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfilController {
    @RequestMapping(value = "/profil", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "profil";
    }
}
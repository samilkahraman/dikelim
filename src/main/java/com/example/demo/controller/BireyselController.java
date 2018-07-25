package com.example.demo.controller;

import com.example.demo.model.Etkinlik;
import com.example.demo.model.Kisi;
import com.example.demo.service.AgacService;
import com.example.demo.service.Dikim_AlaniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BireyselController {
    @Autowired
    AgacService agacService;
    @Autowired
    Dikim_AlaniService dikim_alaniService;

    @RequestMapping(value = "/bireysel", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "bireysel";
    }

}
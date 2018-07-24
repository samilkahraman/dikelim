package com.example.demo.controller;

import com.example.demo.model.Kisi;
import com.example.demo.service.AgacService;
import com.example.demo.service.AgacServiceImpl;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GenelController {
    @Autowired
    KisiService kisiService;
    @Autowired
    AgacService agacService;


    @GetMapping(path = "genel/{id}")
    public ModelAndView passParametersWithModelAndView(@PathVariable String id, Model model) {
        int tp = kisiService.toplamKullanici();
        int agacSayisi= agacService.toplamAgac();
        System.out.println(tp + " - " + agacSayisi);
        ModelAndView modelAndView = new ModelAndView("genel");
        modelAndView.addObject("mesaj", tp);
        modelAndView.addObject("agacSayi",agacSayisi);
        return modelAndView;
    }
}
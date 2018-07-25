package com.example.demo.controller;

import com.example.demo.model.Agac;
import com.example.demo.model.Etkinlik;
import com.example.demo.model.Kisi;
import com.example.demo.service.EtkinlikService;
import com.example.demo.service.KisiService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Controller
public class EtkinlikSecimController {
    @Autowired
    KisiService kisiService;
    @Autowired
    EtkinlikService etkinlikService;



    @RequestMapping(value = "/etkinlikSecim", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "etkinlikSecim";
    }







}
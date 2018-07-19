package com.example.demo.web;

import com.example.demo.service.KisiService;

import com.example.demo.model.Kisi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//   Author:Utku Aysev
//   mail:utkua557@gmail.com
    @Controller
    public class BilgiController {

    @Autowired
   private KisiService kisiService;


    @RequestMapping(value = "/bilgi", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "bilgi";
    }
    }



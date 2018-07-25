package com.example.demo.controller;

import com.example.demo.model.Kisi;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class KontrolController {
    @Autowired
    KisiService kisiService;

    @RequestMapping(value = "/kontrol", method = RequestMethod.GET)
    public String kontrol(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "kontrol";
    }

}

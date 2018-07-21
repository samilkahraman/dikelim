package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.model.Kisi;
import com.example.demo.repository.KisiRepository;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @Autowired
    KisiService kisiService;

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }


    @RequestMapping(value = {"/greeting"}, method = RequestMethod.POST)

    public ResponseEntity<?> deneme(@RequestParam(value = "name", required = true) String name,
                                    @RequestParam(value ="surname", required =true) String surname) {

        Kisi kisi = new Kisi();
        kisi.setIsim(name);
        kisi.setSoyisim(surname);
        kisi.setDogum_tarihi(null);
        kisiService.save(kisi);
    return null;
    }

        @GetMapping("/result")
    public String result(Model model) {

        model.addAttribute("greeting", new Greeting());
        return "result";
    }
}
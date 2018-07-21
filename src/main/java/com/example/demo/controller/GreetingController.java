package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.model.Kisi;
import com.example.demo.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

   // @Autowired
    KisiRepository repository;

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, @ModelAttribute Kisi kisi) {
        Kisi a = new Kisi();
        a.setId(new Long(1243));
        a.setIsim("jhh");
        a.setSoyisim("k");
        a.setDogum_tarihi(null);
        repository.save(a);
        return "result";
    }

    @GetMapping("/result")
    public String result(Model model) {

        model.addAttribute("greeting", new Greeting());
        return "result";
    }
}
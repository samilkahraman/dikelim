package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.model.Kullanici;
import com.example.demo.service.KisiService;

import com.example.demo.model.Kisi;
import com.example.demo.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


//   Author:Utku Aysev
//   mail:utkua557@gmail.com
@Controller
public class LoginController {

    @Autowired
    KisiService kisiService;

    @Autowired
    KullaniciService kullaniciService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String registration(Model model) {


        return "login";
    }


    @RequestMapping(value = {"/newuser"}, method = RequestMethod.POST)
    public ResponseEntity<?> deneme(@RequestParam(value = "name", required = true) String name,
                                    @RequestParam(value ="surname", required =true) String surname,
                                    @RequestParam(value="bdate",required = true)Date bdate,
                                    @RequestParam(value="username",required = true)String username,
                                    @RequestParam(value="password",required = true)String password)

    {
        Kullanici k=new Kullanici();
        k.setIsim(name);
        k.setSoyisim(surname);
        k.setDogum_tarihi(bdate);
        k.setKullaniciAdi(username);
        k.setPassword(password);
        kullaniciService.save(k);
        return null;
    }



}



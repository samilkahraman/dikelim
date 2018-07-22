package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.model.Kullanici;
import com.example.demo.service.KisiService;

import com.example.demo.model.Kisi;
import com.example.demo.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
                                    @RequestParam(value = "surname", required = true) String surname,
                                    @RequestParam(value = "bdate", required = true) String bdate,
                                    @RequestParam(value = "username", required = true) String username,
                                    @RequestParam(value = "password", required = true) String password)

    {
        Date date1 = new Date();
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(bdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Kullanici k = new Kullanici();
        k.setIsim(name);
        k.setSoyisim(surname);
        k.setDogum_tarihi(date1);
        k.setKullaniciAdi(username);
        k.setPassword(password);
        kullaniciService.save(k);
        return null;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public ResponseEntity<?> deneme(@RequestParam(value = "username", required = true) String username,
                                    @RequestParam(value = "password", required = true) String password) {
        Kisi k=kisiService.findByKullaniciAdi(username);
        try {
            if (k.getPassword().equals(password))
                return new ResponseEntity<String>("home/"+k.getId(), HttpStatus.OK);
            else
                return new ResponseEntity<String>("1", HttpStatus.OK);
        }catch (NullPointerException e){
                return new ResponseEntity<String>("1", HttpStatus.OK);

        }
    }
    @GetMapping(path = "home/{id}")
    public String resetpasswordwithmail(@PathVariable String id, Model model) {
        return "home";
    }

    @GetMapping(path = "dikim/{id}")
    public String dikim(@PathVariable String id, Model model) {
        return "dikim";
    }


}



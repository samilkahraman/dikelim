package com.example.demo.controller;

import com.example.demo.model.Kisi;
import com.example.demo.service.KisiService;
import com.example.demo.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ProfilController {
    @Autowired
    KisiService kisiService;

    @Autowired
    KullaniciService kullaniciService;

    @RequestMapping(value = "/profil", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "profil";
    }

    @RequestMapping(value = {"/sifredegisim"}, method = RequestMethod.POST)
    public ResponseEntity<?> sifreupdate(@RequestParam(value = "es", required = true) String eskis,
                                    @RequestParam(value = "ys", required = true) String yenis,
                                     @RequestParam(value = "yst", required = true) String yenist)
    {
        Kisi k=kisiService.findBySifre(eskis);
        try {

            if (k.getPassword().equals(eskis)){
                k.setPassword(yenis);
                kisiService.save(k);
                return new ResponseEntity<String>("home/"+k.getId(), HttpStatus.OK);
            }

            else
                return new ResponseEntity<String>("1", HttpStatus.OK);
        }catch (NullPointerException e){
            return new ResponseEntity<String>("1", HttpStatus.OK);

        }
    }
}
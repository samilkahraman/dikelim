package com.example.demo.controller;

import com.example.demo.model.Kisi;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KontrolController {
    @Autowired
    KisiService kisiService;

    @RequestMapping(value = "/kontrol", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "kontrol";
    }


    @RequestMapping(value = {"/kullaniciSilme"}, method = RequestMethod.POST)
    public ResponseEntity<?> sifreupdate(@RequestParam(value = "silKullanici", required = true) String kullaniciAdi,
                                         @RequestParam(value = "silKullaniciT", required = true) String kullaniciAdiT)
    {
        Kisi k=kisiService.findByKullaniciAdi(kullaniciAdi);
        try {

            if (k.getKullaniciAdi().equals(kullaniciAdiT)){
                kisiService.deleteByKullaniciAdi(k.getKullaniciAdi());
                return new ResponseEntity<String>("home", HttpStatus.OK);
            }

            else
                return new ResponseEntity<String>("1", HttpStatus.OK);
        }catch (NullPointerException e){
            return new ResponseEntity<String>("1", HttpStatus.OK);

        }
    }
}
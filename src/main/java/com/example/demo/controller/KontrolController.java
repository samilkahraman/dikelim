package com.example.demo.controller;

import com.example.demo.model.Etkinlik;
import com.example.demo.model.Kisi;
import com.example.demo.service.EtkinlikService;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;


@Controller
public class KontrolController {
    @Autowired
    KisiService kisiService;

    @Autowired
    EtkinlikService etkinlikService;

    @RequestMapping(value = "/kontrol", method = RequestMethod.GET)
    public String kontrol(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "kontrol";
    }

    @RequestMapping(value = {"/etkinliksec"}, method = RequestMethod.POST)
    public ResponseEntity<?> etkinlik(@RequestParam(value = "user_id", required = true) Long user_id,
                                    @RequestParam(value = "etkinlik_id", required = true) Long etkinlik_id) {
        try {
            Kisi kisi = kisiService.findById(user_id);
            Etkinlik etkinlik = etkinlikService.findbyId(etkinlik_id);
            Set<Etkinlik> etkinlikSet = kisi.getEtkinlikSet();
            etkinlikSet.add(etkinlik);
            kisi.setEtkinlikSet(etkinlikSet);
        }catch (Exception e){
            return new ResponseEntity<String>("1", HttpStatus.OK);

        }
        return new ResponseEntity<String>("0", HttpStatus.OK);

    }

}

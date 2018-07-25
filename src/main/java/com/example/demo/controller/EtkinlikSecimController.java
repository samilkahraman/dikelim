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

    public static class InnerEtkinlik {
        public Long id;
        public String aciklama;
        public String isim;
        public Long katilim_sayisi;
        public String tarih;
        public String dikimAlani;

        public InnerEtkinlik(Long id, String aciklama, String isim, Long katilim_sayisi, String tarih, String dikimAlani){
            this.id=id;
            this.aciklama=aciklama;
            this.isim=isim;
            this.katilim_sayisi=katilim_sayisi;
            this.tarih=tarih;
            this.dikimAlani=dikimAlani;
        }

    }

    @RequestMapping(value = "/etkinlikSecim", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "etkinlikSecim";
    }
    @RequestMapping(value = {"/getetkinlik"}, method = RequestMethod.GET)
    public ResponseEntity<?> deneme() {
        List<Etkinlik> etkinlikarray = etkinlikService.findAll();
        List<InnerEtkinlik> innerEtkinlikList = new ArrayList<>();
        for(Etkinlik e:etkinlikarray){
            innerEtkinlikList.add(new InnerEtkinlik(e.getId(),e.getAciklama(),e.getIsim(),
                    e.getKatılım_sayisi(),e.getTarih().toString(),e.getDikim_alani().getIsim()));
        }
        return new ResponseEntity<List<InnerEtkinlik>>(innerEtkinlikList, HttpStatus.OK);


    }






}
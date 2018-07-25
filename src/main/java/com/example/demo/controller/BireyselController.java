package com.example.demo.controller;


import com.example.demo.model.Agac;
import com.example.demo.model.Etkinlik;

import com.example.demo.model.Kisi;
import com.example.demo.service.AgacService;
import com.example.demo.service.Dikim_AlaniService;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BireyselController {

    public static class InnerEtkinlik {
        public String isim;
        public Long katılım_sayisi;
        public String tarih;
        public String dikim_alani;

        public InnerEtkinlik(String isim, Long katılım_sayisi, String tarih, String dikim_alani) {
            this.isim = isim;
            this.katılım_sayisi = katılım_sayisi;
            this.tarih = tarih;
            this.dikim_alani = dikim_alani;
        }
    }
    public static class InnerAgac{
        public String agac_turu;
        public String dikim_alani;
        public String isim;
        public String satin_alinma_tarihi;
        public String adanan_kisi;
        public String etkinlik;
        public String mesaj;
        public String dikilme_tarihi;

        public InnerAgac(String agac_turu, String dikim_alani, String isim, String satin_alinma_tarihi, String adanan_kisi, String etkinlik, String dikim_alani1, String mesaj, String dikilme_tarihi) {
            this.agac_turu = agac_turu;
            this.dikim_alani = dikim_alani;
            this.isim = isim;
            this.satin_alinma_tarihi = satin_alinma_tarihi;
            this.adanan_kisi = adanan_kisi;
            this.etkinlik = etkinlik;
            this.dikim_alani = dikim_alani1;
            this.mesaj = mesaj;
            this.dikilme_tarihi = dikilme_tarihi;
        }
    }


    @Autowired
    AgacService agacService;
    @Autowired
    Dikim_AlaniService dikim_alaniService;
    @Autowired
    private KisiService kisiService;

    @RequestMapping(value = "/bireysel", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "bireysel";
    }

    @RequestMapping(value = {"/getuseretkinlik"}, method = RequestMethod.POST)
    public ResponseEntity<?> deneme(@RequestParam(value = "id", required = true) Long id) {
        Kisi k = kisiService.FindById(id);
        List<InnerEtkinlik> innerEtkinlikList=new ArrayList<>();
        for(Etkinlik etkinlik:k.getEtkinlikSet()){
            innerEtkinlikList.add(new InnerEtkinlik(etkinlik.getIsim(),etkinlik.getKatılım_sayisi(),etkinlik.getTarih().toString(),etkinlik.getDikim_alani().getIsim()));
        }
        return new ResponseEntity<List<InnerEtkinlik>>(innerEtkinlikList, HttpStatus.OK);

    }
    //public InnerAgac(String agac_turu, String dikim_alani, String isim,
      //               String satin_alinma_tarihi, String adanan_kisi, String etkinlik, String dikim_alani1, String mesaj, String dikilme_tarihi) {
    @RequestMapping(value = ("getuseragac"),method = RequestMethod.POST)
    public ResponseEntity<?> getuseragac(@RequestParam(value = "id", required = true) Long id){
        Kisi k = kisiService.FindById(id);
        List<InnerAgac> innerAgacList=new ArrayList<>();
        for(Agac agac:k.getSatin_alinan_agacSet()){
            innerAgacList.add(new InnerAgac(agac.getAgac_turu().getIsim(),agac.getDikim_alani().getIsim(),agac.getIsim(),agac.getSatin_alinma_tarihi().toString(),
                    agac.getAdanan_kisi(),agac.getEtkinlik().getIsim(),agac.getEtkinlik().getDikim_alani().getIsim(),agac.getMesaj(),agac.getEtkinlik().getTarih().toString()));

        }
        return new ResponseEntity<List<InnerAgac>>(innerAgacList, HttpStatus.OK);

    }
}
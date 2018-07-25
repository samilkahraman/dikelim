package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
public class EtkinlikSecimController {
    @Autowired
    KisiService kisiService;
    @Autowired
    EtkinlikService etkinlikService;
    @Autowired
    AgacService agacService;
    @Autowired
    Dikim_AlaniService dikim_alaniService;
    @Autowired
    SehirService sehirService;
    @Autowired
    BolgeService bolgeService;
    @Autowired
    Agac_turuService agac_turuService;

    public static class InnerEtkinlik {
        public Long id;
        public String aciklama;
        public String isim;
        public Long katilim_sayisi;
        public String tarih;
        public String dikimAlani;

        public InnerEtkinlik(Long id, String aciklama, String isim, Long katilim_sayisi, String tarih, String dikimAlani) {
            this.id = id;
            this.aciklama = aciklama;
            this.isim = isim;
            this.katilim_sayisi = katilim_sayisi;
            this.tarih = tarih;
            this.dikimAlani = dikimAlani;
        }

    }

    public static class InnerSehir{
        private Long id;
        private String name;
        private String bolge;

        public InnerSehir(Long id, String name, String bolge) {
            this.id = id;
            this.name = name;
            this.bolge = bolge;
        }
    }

    public static class InnerAgac {
        private Long id;
        private String adanan;
        private String isim;
        private String mesaj;
        private String alım_tarihi;
        private String agac_turu;
        private String dikim_alani;
        private String etkinlik;
        private String satin_alan;


        public InnerAgac(Long id, String adanan, String isim, String mesaj, String alım_tarihi, String agac_turu, String dikim_alani, String etkinlik, String satin_alan) {
            this.id = id;
            this.adanan = adanan;
            this.isim = isim;
            this.mesaj = mesaj;
            this.alım_tarihi = alım_tarihi;
            this.agac_turu = agac_turu;
            this.dikim_alani = dikim_alani;
            this.etkinlik = etkinlik;
            this.satin_alan = satin_alan;
        }

    }

    public static class InnerDikimAlanı {
        private String isim;
        private Long kapasite;
        private String toprak_yapisi;
        private Long tahmini_sulama_sikligi;
        private Long dikim_alani_id;
        private String sehir;

        public InnerDikimAlanı(String isim, Long kapasite, String toprak_yapisi, Long tahmini_sulama_sikligi, Long dikim_alani_id, String sehir) {
            this.isim = isim;
            this.kapasite = kapasite;
            this.toprak_yapisi = toprak_yapisi;
            this.tahmini_sulama_sikligi = tahmini_sulama_sikligi;
            this.dikim_alani_id = dikim_alani_id;
            this.sehir = sehir;
        }
    }

    public static class InnerBolge{
        private Long id;
        private String name;

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
        for (Etkinlik e : etkinlikarray) {
            innerEtkinlikList.add(new InnerEtkinlik(e.getId(), e.getAciklama(), e.getIsim(),
                    e.getKatılım_sayisi(), e.getTarih().toString(), e.getDikim_alani().getIsim()));
        }
        return new ResponseEntity<List<InnerEtkinlik>>(innerEtkinlikList, HttpStatus.OK);


    }

    @RequestMapping(value = {"/getagac"}, method = RequestMethod.GET)
    public ResponseEntity<?> getagac() {
        List<Agac> agaclist = agacService.findAll();
        List<InnerAgac> inneragaclist = new ArrayList<>();
        for (Agac a : agaclist) {
            inneragaclist.add(new InnerAgac(a.getId(), a.getAdanan_kisi(), a.getIsim(), a.getMesaj(), a.getSatin_alinma_tarihi().toString(),
                    a.getAgac_turu().getIsim(), a.getDikim_alani().getIsim(),
                    a.getEtkinlik().getIsim(), a.getSatin_alan_kisi().getIsim()+" "+a.getSatin_alan_kisi().getSoyisim()));
                   }
        return new ResponseEntity<List<InnerAgac>>(inneragaclist, HttpStatus.OK);


    }
/*
    @RequestMapping(value = {"/getdikimalani"}, method = RequestMethod.GET)
    public ResponseEntity<?> getdikimalani() {
        List<Dikim_Alani> dikimAlaniList = dikim_alaniService.findAll();
        List<InnerDikimAlanı> innerDikimAlanıList = new ArrayList<>();
        for (Dikim_Alani dikim_alani : dikimAlaniList) {
            //        public InnerDikimAlanı(String isim, Long kapasite, String toprak_yapisi, Long tahmini_sulama_sikligi, Long dikim_alani_id, String sehir) {
            innerDikimAlanıList.add(new InnerDikimAlanı(dikim_alani.getIsim(), dikim_alani.getKapasite(), dikim_alani.getToprak_yapisi(),
                    dikim_alani.getTahmini_sulama_sikligi(), dikim_alani.getDikim_alani_id(), sehirService.FindById(dikim_alani.getSehir_id()).getName()));
        }
        return new ResponseEntity<List<InnerDikimAlanı>>(innerDikimAlanıList, HttpStatus.OK);


    }

    @RequestMapping(value = {"/getbolge"}, method = RequestMethod.GET)
    public ResponseEntity<?> getbolge() {
        return new ResponseEntity<List<Bolge>>(bolgeService.findAll(),HttpStatus.OK);

    }
    @RequestMapping(value = {"/getsehir"}, method = RequestMethod.GET)
    public ResponseEntity<?> getsehir() {
        List<Sehir> sehirList = sehirService.findAll();
        List<InnerSehir> innersehirList = new ArrayList<>();

        for (Sehir sehir:sehirList){
            innersehirList.add(new InnerSehir(sehir.getId(),sehir.getName(),sehir.getBolge().getName()));
        }
        return new ResponseEntity<List<InnerSehir>>(innersehirList,HttpStatus.OK);

    }
    @RequestMapping(value = {"/getagacturu"}, method = RequestMethod.GET)
    public ResponseEntity<?> getagacturu() {
        return new ResponseEntity<List<Agac_Turu>>(agac_turuService.findAll(),HttpStatus.OK);

    }
    @RequestMapping(value = {"/getkisi"}, method = RequestMethod.GET)
    public ResponseEntity<?> getkisi() {
        return new ResponseEntity<List<Kisi>>(kisiService.findAll(),HttpStatus.OK);
    }

    @RequestMapping(value = {"/getdikilirler"}, method = RequestMethod.GET)
    public ResponseEntity<?> getdikilirler() {
        return new ResponseEntity<List<Kisi>>(kisiService.findAll(),HttpStatus.OK);
    }
*/

}
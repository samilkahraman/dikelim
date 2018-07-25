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
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Null;
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

    public static class InnerAgac {
        public Long id;
        public String adanan;
        public String isim;
        public String mesaj;
        public String alim_tarihi;
        public String agac_turu;
        public String dikim_alani;
        public String etkinlik;
        public String satin_alan;


        public InnerAgac(Long id, String adanan, String isim, String mesaj, String alım_tarihi, String agac_turu, String dikim_alani, String etkinlik, String satin_alan) {
            this.id = id;
            this.adanan = adanan;
            this.isim = isim;
            this.mesaj = mesaj;
            this.alim_tarihi = alım_tarihi;
            this.agac_turu = agac_turu;
            this.dikim_alani = dikim_alani;
            this.etkinlik = etkinlik;
            this.satin_alan = satin_alan;
        }

    }

    public static class InnerDikimAlanı {
        public String isim;
        public Long kapasite;
        public String toprak_yapisi;
        public Long tahmini_sulama_sikligi;
        public Long dikim_alani_id;
        public String sehir;

        public InnerDikimAlanı(String isim, Long kapasite, String toprak_yapisi, Long tahmini_sulama_sikligi, Long dikim_alani_id, String sehir) {
            this.isim = isim;
            this.kapasite = kapasite;
            this.toprak_yapisi = toprak_yapisi;
            this.tahmini_sulama_sikligi = tahmini_sulama_sikligi;
            this.dikim_alani_id = dikim_alani_id;
            this.sehir = sehir;
        }
    }

    public static class InnerSehir{
        public Long id;
        public String name;
        public String bolge;

        public InnerSehir(Long id, String name, String bolge) {
            this.id = id;
            this.name = name;
            this.bolge = bolge;
        }
    }

    public static class InnerBolge{
        public Long id;
        public String name;
        public String ozellikler;

        public InnerBolge(Long id, String name, String ozellikler) {
            this.id = id;
            this.name = name;
            this.ozellikler = ozellikler;
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
            try{
                inneragaclist.add(new InnerAgac(a.getId(), a.getAdanan_kisi(), a.getIsim(), a.getMesaj(), a.getSatin_alinma_tarihi().toString(),
                        a.getAgac_turu().getIsim(), a.getDikim_alani().getIsim(),
                        a.getEtkinlik().getIsim(), a.getSatin_alan_kisi().getIsim()+" "+a.getSatin_alan_kisi().getSoyisim()));

            }catch (NullPointerException e){
                System.out.println("null döndü");
            }

        }
        return new ResponseEntity<List<InnerAgac>>(inneragaclist, HttpStatus.OK);


    }

    @RequestMapping(value = {"/getdikimalani"}, method = RequestMethod.GET)
    public ResponseEntity<?> getdikimalani() {
        List<Dikim_Alani> dikimAlaniList = dikim_alaniService.findAll();
        List<InnerDikimAlanı> innerDikimAlanıList = new ArrayList<>();
        for (Dikim_Alani dikim_alani : dikimAlaniList) {
            //        public InnerDikimAlanı(String isim, Long kapasite, String toprak_yapisi, Long tahmini_sulama_sikligi, Long dikim_alani_id, String sehir) {
            innerDikimAlanıList.add(new InnerDikimAlanı(dikim_alani.getIsim(), dikim_alani.getKapasite(), dikim_alani.getToprak_yapisi(),
                    dikim_alani.getTahmini_sulama_sikligi(), dikim_alani.getDikim_alani_id(), dikim_alani.getSehir().getName()));
        }
        return new ResponseEntity<List<InnerDikimAlanı>>(innerDikimAlanıList, HttpStatus.OK);


    }

    @RequestMapping(value = {"/getbolge"}, method = RequestMethod.GET)
    public ResponseEntity<?> getbolge() {

        List<Bolge> bolgeList = bolgeService.findAll();
        List<InnerBolge> innerbolgeList = new ArrayList<>();

        for (Bolge bolge:bolgeList){
            innerbolgeList.add(new InnerBolge(bolge.getId(),bolge.getName(),bolge.getOzellikler()));
        }
        return new ResponseEntity<List<InnerBolge>>(innerbolgeList,HttpStatus.OK);
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

    public static class InnerDikilirler{
        public String dikim_alani;
        public String agac_turu;
    }


    @RequestMapping(value = {"/getdikilirler"},method = RequestMethod.GET)
    public ResponseEntity<?> getdikilirler() {
        List<Dikim_Alani> dikimalanilist = dikim_alaniService.findAll();
        List<InnerDikilirler> innerDikilirlerList = new ArrayList<>();
        for (Dikim_Alani dikim_alani : dikimalanilist) {
            for (Agac_Turu agac_turu : dikim_alani.getAgac_turu_set()) {
                InnerDikilirler innerDikilirler = new InnerDikilirler();
                innerDikilirler.agac_turu = agac_turu.getIsim();
                innerDikilirler.dikim_alani = dikim_alani.getIsim();
                innerDikilirlerList.add(innerDikilirler);
            }
        }
        return new ResponseEntity<List<InnerDikilirler>>(innerDikilirlerList, HttpStatus.OK);
    }


    @RequestMapping(value = {"/getkisi"}, method = RequestMethod.GET)
    public ResponseEntity<?> getkisi() {
        List<InnerKisi> innerKisiList=new ArrayList<>();
        for(Kisi k:kisiService.findAll()){
            InnerKisi innerKisi=new InnerKisi(k.getId(),k.getDogum_tarihi().toString(),k.getIsim(),k.getSoyisim(),
                    k.getPassword(),k.getKullaniciAdi());
            innerKisiList.add(innerKisi);
        }
        return new ResponseEntity<List<InnerKisi>>(innerKisiList,HttpStatus.OK);
    }

    @RequestMapping(value = {"/deleteSehir"}, method = RequestMethod.POST)
    public ResponseEntity<?> deleteSehir(@RequestParam(value = "id", required = true) Long id) {
        Sehir sehir = sehirService.FindById(id);
        sehirService.delete(sehir);
        return null;
    }

    @RequestMapping(value = {"/deleteBolge"}, method = RequestMethod.POST)
    public ResponseEntity<?> deleteBolge(@RequestParam(value = "id", required = true) Long id) {
        Bolge bolge = bolgeService.FindById(id);
        bolgeService.delete(bolge);
        return null;
    }

    @RequestMapping(value = {"/deleteEtkinlik"}, method = RequestMethod.POST)
    public ResponseEntity<?> deleteEtkinlik(@RequestParam(value = "id", required = true) Long id) {
        Etkinlik etkinlik = etkinlikService.findbyId(id);
        etkinlikService.delete(etkinlik);
        return null;
    }

    @RequestMapping(value = {"/deleteKisi"}, method = RequestMethod.POST)
    public ResponseEntity<?> deleteKisi(@RequestParam(value = "id", required = true) Long id) {
        Kisi kisi = kisiService.FindById(id);
        kisiService.delete(kisi);
        return null;
    }

    @RequestMapping(value = {"/deleteAgac"}, method = RequestMethod.POST)
    public ResponseEntity<?> deleteAgac(@RequestParam(value = "id", required = true) Long id) {
        Agac agac = agacService.FindById(id);
        agacService.delete(agac);
        return null;
    }

    @RequestMapping(value = {"/deleteDikimAlani"}, method = RequestMethod.POST)
    public ResponseEntity<?> deleteDikimAlani(@RequestParam(value = "id", required = true) Long id) {
        Dikim_Alani dikim_alani = dikim_alaniService.FindById(id);
        dikim_alaniService.delete(dikim_alani);
        return null;
    }

    @RequestMapping(value = {"/deleteAgacTuru"}, method = RequestMethod.POST)
    public ResponseEntity<?> deleteAgacTuru(@RequestParam(value = "id", required = true) Long id) {
        Agac_Turu agac_turu = agac_turuService.findbyId(id);
        agac_turuService.delete(agac_turu);
        return null;
    }

    @RequestMapping(value = {"/getagacturu"}, method = RequestMethod.GET)
    public ResponseEntity<?> getagacturu() {
        List<InnerAgacTuru> innerAgacTuruList=new ArrayList<>();
        for(Agac_Turu agac_turu:agac_turuService.findAll()){
            InnerAgacTuru innerAgacTuru=new InnerAgacTuru(agac_turu.getAciklama(),agac_turu.getIsim(),agac_turu.getAgac_turu_id());
            innerAgacTuruList.add(innerAgacTuru);
        }
        return new ResponseEntity<List<InnerAgacTuru>>(innerAgacTuruList,HttpStatus.OK);
    }
    @RequestMapping(value = {"/getkatilim"}, method = RequestMethod.GET)
    public ResponseEntity<?> getkatilim() {
        List<Etkinlik> etkinlikList = etkinlikService.findAll();
        List<InnerKatilim> innerKatilimList = new ArrayList<>();
        for (Etkinlik etkinlik : etkinlikList) {
            for (Kisi kisi : etkinlik.getKisiSet()) {
                InnerKatilim innerKatilim = new InnerKatilim();
                innerKatilim.etkinlik = etkinlik.getIsim();
                innerKatilim.kisi = kisi.getIsim() + " " + kisi.getSoyisim();
                innerKatilimList.add(innerKatilim);
            }
        }

        return new ResponseEntity<List<InnerKatilim>>(innerKatilimList, HttpStatus.OK);
    }

    public static class InnerKatilim{
        public String etkinlik;
        public String kisi;
    }


    public static class InnerKisi{
        public Long id;
        public String dogum_tarihi;
        public String isim;
        public String soyisim;
        public String kullanici_adi;
        public String password;
        public Long puan;

        public InnerKisi(Long id, String dogum_tarihi, String isim, String soyisim, String password,String kullanici_adi) {
            this.id = id;
            this.dogum_tarihi = dogum_tarihi;
            this.isim = isim;
            this.soyisim = soyisim;
            this.password = password;
            this.kullanici_adi=kullanici_adi;
        }
    }

    public static class InnerAgacTuru{
        public String aciklama;
        public String isim;
        public Long agac_turu_id;

        public InnerAgacTuru(String aciklama, String isim, Long agac_turu_id) {
            this.aciklama = aciklama;
            this.isim = isim;
            this.agac_turu_id = agac_turu_id;
        }
    }




}
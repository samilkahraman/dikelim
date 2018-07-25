package com.example.demo.controller;

import com.example.demo.model.Agac;
import com.example.demo.model.Dikim_Alani;
import com.example.demo.model.Kisi;
import com.example.demo.model.Kullanici;
import com.example.demo.service.AgacService;
import com.example.demo.service.Agac_turuService;
import com.example.demo.service.Dikim_AlaniService;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class DikimController {

    @Autowired
    Agac_turuService agac_turuService;
    @Autowired
    Dikim_AlaniService dikim_alaniService;
    @Autowired
    AgacService agacService;
    @Autowired
    KisiService kisiService;
    @RequestMapping(value = "/dikim", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Kisi());

        return "dikim";
    }

    @RequestMapping(value = {"/agacdik"}, method = RequestMethod.POST)
    public ResponseEntity<?> deneme(@RequestParam(value = "adanan_ismi", required = true) String adanan_ismi,
                                    @RequestParam(value = "agac", required = true) String agac,
                                    @RequestParam(value = "tur", required = true) String turId,
                                    @RequestParam(value = "mesaj", required = true) String mesaj,
                                    @RequestParam(value = "alan", required = true) String alan,
                                    @RequestParam(value = "id",required = true) String id){
    try{

            Date now = new Date();
            Agac yeniagac = new Agac();
            yeniagac.setAdanan_kisi(adanan_ismi);
            yeniagac.setIsim(agac);
            yeniagac.setAgac_turu(agac_turuService.findbyId(new Long(turId)));
            Dikim_Alani dikim_alani = (dikim_alaniService.findByDikim_alani_id(new Long(alan)));
            yeniagac.setDikim_alani(dikim_alani);
            yeniagac.setMesaj(mesaj);
            yeniagac.setSatin_alinma_tarihi(now);
            yeniagac.setSatin_alan_kisi(kisiService.findById(new Long(id)));
            yeniagac.setDikildi_mi(false);
            agacService.save(yeniagac);

            return new ResponseEntity<String>("0", HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>("1", HttpStatus.OK);

        }
    }



}
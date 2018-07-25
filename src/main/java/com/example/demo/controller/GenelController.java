package com.example.demo.controller;

import com.example.demo.model.Kisi;
import com.example.demo.service.AgacService;
import com.example.demo.service.AgacServiceImpl;
import com.example.demo.service.BolgeService;
import com.example.demo.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GenelController {
    @Autowired
    KisiService kisiService;
    @Autowired
    AgacService agacService;
    @Autowired
    BolgeService bolgeService;


    @GetMapping(path = "genel/{id}")
    public ModelAndView passParametersWithModelAndView(@PathVariable String id, Model model) {
        ModelAndView modelAndView = new ModelAndView("genel");

        int tp = kisiService.toplamKullanici();
        int agacSayisi= agacService.toplamAgac();

        //İÇ ANADOLU AĞAÇLAR BAŞLANGIÇ
        int icAnadoluKayin=agacService.icAnadoluKayin();
        int icAnadoluMese=agacService.icAnadoluMese();
        int icAnadoluCam=agacService.icAnadoluCam();
        int icAnadoluKavak=agacService.icAnadoluKavak();
        int icAnadoluLadin=agacService.icAnadoluLadin();
        int icAnadoluCeviz=agacService.icAnadoluCeviz();
        int icAnadoluToplamAgac=agacService.icAnadoluToplamAgac();
        modelAndView.addObject("iAKayin",icAnadoluKayin);
        modelAndView.addObject("iAMese",icAnadoluMese);
        modelAndView.addObject("iACam",icAnadoluCam);
        modelAndView.addObject("iAKavak",icAnadoluKavak);
        modelAndView.addObject("iALadin",icAnadoluLadin);
        modelAndView.addObject("iACeviz",icAnadoluCeviz);
        modelAndView.addObject("iAToplam",icAnadoluToplamAgac);
        //İÇ ANADOLU AĞAÇLAR BİTİŞ


        //------------------------


        //DOĞU ANADOLU AĞAÇLAR BAŞLANGIÇ
        int doğuAnadoluKayin=agacService.doğuAnadoluKayin();
        int doğuAnadoluMese=agacService.doğuAnadoluMese();
        int doğuAnadoluCam=agacService.doğuAnadoluCam();
        int doğuAnadoluKavak=agacService.doğuAnadoluKavak();
        int doğuAnadoluLadin=agacService.doğuAnadoluLadin();
        int doğuAnadoluCeviz=agacService.doğuAnadoluCeviz();
        int doğuAnadoluToplamAgac=agacService.doğuAnadoluToplamAgac();
        modelAndView.addObject("dAKayin",doğuAnadoluKayin);
        modelAndView.addObject("dAMese",doğuAnadoluMese);
        modelAndView.addObject("dACam",doğuAnadoluCam);
        modelAndView.addObject("dAKavak",doğuAnadoluKavak);
        modelAndView.addObject("dALadin",doğuAnadoluLadin);
        modelAndView.addObject("dACeviz",doğuAnadoluCeviz);
        modelAndView.addObject("dAToplam",doğuAnadoluToplamAgac);
        //DOĞU ANADOLU AĞAÇLAR BİTİŞ

        //KARADENİZ AĞAÇLAR BAŞLANGIÇ
        int karadenizKayin=agacService.karadenizKayin();
        int karadenizMese=agacService.karadenizMese();
        int karadenizCam=agacService.karadenizCam();
        int karadenizKavak=agacService.karadenizKavak();
        int karadenizLadin=agacService.karadenizLadin();
        int karadenizCeviz=agacService.karadenizCeviz();
        int karadenizToplamAgac=agacService.karadenizToplamAgac();
        modelAndView.addObject("kKayin",karadenizKayin);
        modelAndView.addObject("kMese",karadenizMese);
        modelAndView.addObject("kCam",karadenizCam);
        modelAndView.addObject("kKavak",karadenizKavak);
        modelAndView.addObject("kLadin",karadenizLadin);
        modelAndView.addObject("kCeviz",karadenizCeviz);
        modelAndView.addObject("kToplam",karadenizToplamAgac);
        //KARADENİZ AĞAÇLAR BİTİŞ


        //GÜNEY DOĞU ANADOLU  AĞAÇLAR BAŞLANGIÇ
        int gDAnadoluKayin=agacService.gDAnadoluKayin();
        int gDAnadoluMese=agacService.gDAnadoluMese();
        int gDAnadoluCam=agacService.gDAnadoluCam();
        int gDAnadoluKavak=agacService.gDAnadoluKavak();
        int gDAnadoluLadin=agacService.gDAnadoluLadin();
        int gDAnadoluCeviz=agacService.gDAnadoluCeviz();
        int gDAnadoluToplamAgac=agacService.gDAnadoluToplamAgac();
        modelAndView.addObject("gDAKayin",gDAnadoluKayin);
        modelAndView.addObject("gDAMese",gDAnadoluMese);
        modelAndView.addObject("gDACam",gDAnadoluCam);
        modelAndView.addObject("gDAKavak",gDAnadoluKavak);
        modelAndView.addObject("gDALadin",gDAnadoluLadin);
        modelAndView.addObject("gDACeviz",gDAnadoluCeviz);
        modelAndView.addObject("gDAToplam",gDAnadoluToplamAgac);
        //GÜNEY DOĞU ANADOLU BAŞLANGIÇ




//-------------------------



        //AKDENİZ  AĞAÇLAR BAŞLANGIÇ
        int akdenizKayin=agacService.akdenizKayin();
        int akdenizMese=agacService.akdenizMese();
        int akdenizCam=agacService.akdenizCam();
        int akdenizKavak=agacService.akdenizKavak();
        int akdenizLadin=agacService.akdenizLadin();
        int akdenizCeviz=agacService.akdenizCeviz();
        int akdenizToplamAgac=agacService.akdenizToplamAgac();
        modelAndView.addObject("aKayin",akdenizKayin);
        modelAndView.addObject("aMese",akdenizMese);
        modelAndView.addObject("aCam",akdenizCam);
        modelAndView.addObject("aKavak",akdenizKavak);
        modelAndView.addObject("aLadin",akdenizLadin);
        modelAndView.addObject("aCeviz",akdenizCeviz);
        modelAndView.addObject("aToplam",akdenizToplamAgac);
        //AKDENİZ BİTİŞ




        //-------------------------



        //Ege  AĞAÇLAR BAŞLANGIÇ
        int egeKayin=agacService.egeKayin();
        int egeMese=agacService.egeMese();
        int egeCam=agacService.egeCam();
        int egeKavak=agacService.egeKavak();
        int egeLadin=agacService.egeLadin();
        int egeCeviz=agacService.egeCeviz();
        int egeToplamAgac=agacService.egeToplamAgac();
        modelAndView.addObject("eKayin",egeKayin);
        modelAndView.addObject("eMese",egeMese);
        modelAndView.addObject("eCam",egeCam);
        modelAndView.addObject("eKavak",egeKavak);
        modelAndView.addObject("eLadin",egeLadin);
        modelAndView.addObject("eCeviz",egeCeviz);
        modelAndView.addObject("eToplam",egeToplamAgac);
        //Ege BİTİŞ




        //-------------------------



        //MARMARA AĞAÇLAR BAŞLANGIÇ
        int marmaraKayin=agacService.marmaraKayin();
        int marmaraMese=agacService.marmaraMese();
        int marmaraCam=agacService.marmaraCam();
        int marmaraKavak=agacService.marmaraKavak();
        int marmaraLadin=agacService.marmaraLadin();
        int marmaraCeviz=agacService.marmaraCeviz();
        int marmaraToplamAgac=agacService.marmaraToplamAgac();
        modelAndView.addObject("mKayin",marmaraKayin);
        modelAndView.addObject("mMese",marmaraMese);
        modelAndView.addObject("mCam",marmaraCam);
        modelAndView.addObject("mKavak",marmaraKavak);
        modelAndView.addObject("mLadin",marmaraLadin);
        modelAndView.addObject("mCeviz",marmaraCeviz);
        modelAndView.addObject("mToplam",marmaraToplamAgac);
        //MARMARA BİTİŞ



        String bolgeAdi="";
        String tpk=tp+"";
        String agacSayisiString=agacSayisi+"";
        String [] bolge = bolgeService.bolgeler();
        System.out.println(tp + " - " + agacSayisi);

        for(int i=0;i<bolgeService.bolgeler().length;i++){
             bolgeAdi= "bolgeAdi" + i;
            modelAndView.addObject(bolgeAdi,bolge[i]);
        }
        System.out.println(bolgeAdi);
        modelAndView.addObject("mesaj", tpk);
        modelAndView.addObject("agacSayi",agacSayisiString);


        return modelAndView;
    }
}
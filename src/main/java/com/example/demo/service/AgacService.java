package com.example.demo.service;

import com.example.demo.model.Agac;
import com.example.demo.model.Etkinlik;

import java.util.List;

public interface AgacService {

    void save(Agac agac);

    int toplamAgac();

    List<Agac> findAll();

    //İÇ ANADOLU AĞAÇLAR BAŞLANGIÇ

    int icAnadoluKayin();
    int icAnadoluMese();
    int icAnadoluCam();
    int icAnadoluKavak();
    int icAnadoluLadin();
    int icAnadoluCeviz();
    int icAnadoluToplamAgac();

    //İÇ ANADOLU AĞAÇLAR BİTİŞ



    //------------------------



    //DOĞU ANADOLU AĞAÇLAR BAŞLANGIÇ

    int doğuAnadoluKayin();
    int doğuAnadoluMese();
    int doğuAnadoluCam();
    int doğuAnadoluKavak();
    int doğuAnadoluLadin();
    int doğuAnadoluCeviz();
    int doğuAnadoluToplamAgac();

    //DOĞU ANADOLU AĞAÇLAR BİTİŞ



    //------------------------


    //KARADENİZ ANADOLU AĞAÇLAR BAŞLANGIÇ

    int karadenizKayin();
    int karadenizMese();
    int karadenizCam();
    int karadenizKavak();
    int karadenizLadin();
    int karadenizCeviz();
    int karadenizToplamAgac();

    //KARADENİZ ANADOLU AĞAÇLAR BİTİŞ


    //-------------------------------


    //GÜNEY DOĞU ANADOLU AĞAÇLAR BAŞLANGIÇ

    int gDAnadoluKayin();
    int gDAnadoluMese();
    int gDAnadoluCam();
    int gDAnadoluKavak();
    int gDAnadoluLadin();
    int gDAnadoluCeviz();
    int gDAnadoluToplamAgac();

    //GÜNEY DOĞU ANADOLU AĞAÇLAR BİTİŞ



    //-------------------------



    //AKDENİZ  AĞAÇLAR BAŞLANGIÇ
    int akdenizKayin();
    int akdenizMese();
    int akdenizCam();
    int akdenizKavak();
    int akdenizLadin();
    int akdenizCeviz();
    int akdenizToplamAgac();
    //AKDENİZ BAŞLANGIÇ




    //-------------------------



    //Ege  AĞAÇLAR BAŞLANGIÇ
    int egeKayin();
    int egeMese();
    int egeCam();
    int egeKavak();
    int egeLadin();
    int egeCeviz();
    int egeToplamAgac();
    //Ege BİTİŞ




//-------------------------



    //MARMARA AĞAÇLAR BAŞLANGIÇ
    int marmaraKayin();
    int marmaraMese();
    int marmaraCam();
    int marmaraKavak();
    int marmaraLadin();
    int marmaraCeviz();
    int marmaraToplamAgac();
    //MARMARA BİTİŞ
}

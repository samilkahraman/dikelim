package com.example.demo.service;

import com.example.demo.model.Agac;
import com.example.demo.repository.AgacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgacServiceImpl implements AgacService {
    @Autowired
    AgacRepository agacRepository;

    @Override
    public void save(Agac agac) {
        agacRepository.save(agac);
    }

    @Override
    public int toplamAgac() {
        return agacRepository.toplamAgac();
    }

    @Override
    public List<Agac> findAll() {
        return agacRepository.findAll();
    }

    //İÇ ANADOLU AĞAÇLAR BAŞLANGIÇ

    @Override
    public int icAnadoluKayin() {return agacRepository.icAnadoluKayin();}
    @Override
    public int icAnadoluMese() {return agacRepository.icAnadoluMese();}
    @Override
    public int icAnadoluCam() {return agacRepository.icAnadoluCam();}
    @Override
    public int icAnadoluKavak() {return agacRepository.icAnadoluKavak();}
    @Override
    public int icAnadoluLadin() {return agacRepository.icAnadoluLadin();}
    @Override
    public int icAnadoluCeviz() {return agacRepository.icAnadoluCeviz();}
    @Override
    public int icAnadoluToplamAgac() {return agacRepository.icAnadoluToplamAgac();}

    //İÇ ANADOLU AĞAÇLAR BİTİŞ


    //-----------------------------


    //DOĞU ANADOLU AĞAÇLAR BAŞLANGIÇ
    @Override
    public int doğuAnadoluKayin() {return agacRepository.doguAnadoluKayin();}
    @Override
    public int doğuAnadoluMese() {return agacRepository.doguAnadoluMese();}
    @Override
    public int doğuAnadoluCam() {return agacRepository.doguAnadoluCam();}
    @Override
    public int doğuAnadoluKavak() {return agacRepository.doguAnadoluKavak();}
    @Override
    public int doğuAnadoluLadin() {return agacRepository.doguAnadoluLadin();}
    @Override
    public int doğuAnadoluCeviz() {return agacRepository.doguAnadoluCeviz();}
    @Override
    public int doğuAnadoluToplamAgac() {return agacRepository.doguAnadoluToplamAgac();}
    //DOĞU ANADOLU AĞAÇLAR BAŞLANGIÇ




    //-----------------------------




    //KARADENİZ AĞAÇLAR BAŞLANGIÇ
    @Override
    public int karadenizKayin() {return agacRepository.karadenizKayin();}
    @Override
    public int karadenizMese() {return agacRepository.karadenizMese();}
    @Override
    public int karadenizCam() {return agacRepository.karadenizCam();}
    @Override
    public int karadenizKavak() {return agacRepository.karadenizKavak();}
    @Override
    public int karadenizLadin() {return agacRepository.karadenizLadin();}
    @Override
    public int karadenizCeviz() {return agacRepository.karadenizCeviz();}
    @Override
    public int karadenizToplamAgac() {return agacRepository.karadenizToplamAgac();}
    //KARADENİZ AĞAÇLAR BAŞLANGIÇ



    //----------------------------



    //GÜNEY DOĞU ANADOLU  AĞAÇLAR BAŞLANGIÇ
    @Override
    public int gDAnadoluKayin() {return agacRepository.gDAnadoluKayin();}
    @Override
    public int gDAnadoluMese() {return agacRepository.gDAnadoluMese();}
    @Override
    public int gDAnadoluCam() {return agacRepository.gDAnadoluCam();}
    @Override
    public int gDAnadoluKavak() {return agacRepository.gDAnadoluKavak();}
    @Override
    public int gDAnadoluLadin() {return agacRepository.gDAnadoluLadin();}
    @Override
    public int gDAnadoluCeviz() {return agacRepository.gDAnadoluCeviz();}
    @Override
    public int gDAnadoluToplamAgac() {return agacRepository.gDAnadoluToplamAgac();}
    //GÜNEY DOĞU ANADOLU BAŞLANGIÇ




    //-------------------------



    //AKDENİZ  AĞAÇLAR BAŞLANGIÇ
    @Override
    public int akdenizKayin() {return agacRepository.akdenizKayin();}
    @Override
    public int akdenizMese() {return agacRepository.akdenizMese();}
    @Override
    public int akdenizCam() {return agacRepository.akdenizCam();}
    @Override
    public int akdenizKavak() {return agacRepository.akdenizKavak();}
    @Override
    public int akdenizLadin() {return agacRepository.akdenizLadin();}
    @Override
    public int akdenizCeviz() {return agacRepository.akdenizCeviz();}
    @Override
    public int akdenizToplamAgac() {return agacRepository.akdenizToplamAgac();}
    //AKDENİZ BİTİŞ




//-------------------------



    //Ege  AĞAÇLAR BAŞLANGIÇ
    @Override
    public int egeKayin() {return agacRepository.egeKayin();}
    @Override
    public int egeMese() {return agacRepository.egeMese();}
    @Override
    public int egeCam() {return agacRepository.egeCam();}
    @Override
    public int egeKavak() {return agacRepository.egeKavak();}
    @Override
    public int egeLadin() {return agacRepository.egeLadin();}
    @Override
    public int egeCeviz() {return agacRepository.egeCeviz();}
    @Override
    public int egeToplamAgac() {return agacRepository.egeToplamAgac();}
    //Ege BİTİŞ




    //-------------------------



    //MARMARA AĞAÇLAR BAŞLANGIÇ
    @Override
    public int marmaraKayin() {return agacRepository.marmaraKayin();}
    @Override
    public int marmaraMese() {return agacRepository.marmaraMese();}
    @Override
    public int marmaraCam() {return agacRepository.marmaraCam();}
    @Override
    public int marmaraKavak() {return agacRepository.marmaraKavak();}
    @Override
    public int marmaraLadin() {return agacRepository.marmaraLadin();}
    @Override
    public int marmaraCeviz() {return agacRepository.marmaraCeviz();}
    @Override
    public int marmaraToplamAgac() {return agacRepository.marmaraToplamAgac();}
    //MARMARA BİTİŞ





}




package com.example.demo.repository;

import com.example.demo.model.Agac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.hibernate.sql.Select;
public interface AgacRepository extends JpaRepository<Agac,Long> {

    @Query("SELECT COUNT(id) FROM Agac ")
    int toplamAgac();


    @Query("SELECT  s FROM Agac s WHERE s.id=?1")
    Agac FindById(Long id);


    //İÇ ANADOLU AĞAÇLAR BAŞLANGIÇ

    @Query("Select Count(id) from Agac where (dikim_alani_id=0 or dikim_alani_id=1 or dikim_alani_id=2 or dikim_alani_id=3) and agac_turu_id=0 ")
    int icAnadoluKayin();

    @Query("Select Count(id) from Agac where (dikim_alani_id=0 or dikim_alani_id=1 or dikim_alani_id=2 or dikim_alani_id=3) and agac_turu_id=1 ")
    int icAnadoluMese();

    @Query("Select Count(id) from Agac where (dikim_alani_id=0 or dikim_alani_id=1 or dikim_alani_id=2 or dikim_alani_id=3) and agac_turu_id=2 ")
    int icAnadoluCam();

    @Query("Select Count(id) from Agac where (dikim_alani_id=0 or dikim_alani_id=1 or dikim_alani_id=2 or dikim_alani_id=3) and agac_turu_id=3 ")
    int icAnadoluKavak();

    @Query("Select Count(id) from Agac where (dikim_alani_id=0 or dikim_alani_id=1 or dikim_alani_id=2 or dikim_alani_id=3) and agac_turu_id=4 ")
    int icAnadoluLadin();

    @Query("Select Count(id) from Agac where (dikim_alani_id=0 or dikim_alani_id=1 or dikim_alani_id=2 or dikim_alani_id=3) and agac_turu_id=5 ")
    int icAnadoluCeviz();

    @Query("Select  Count(ag.adanan_kisi) from Agac as ag where ag.dikim_alani=0 or ag.dikim_alani=1 or ag.dikim_alani=2 or ag.dikim_alani=3")
    int icAnadoluToplamAgac();

    // İÇ ANADOLU AĞAÇLAR BİTİŞ





    //--------------------------------------






    //DOĞU ANADOLU AĞAÇLAR BAŞLANGIÇ

    @Query("Select Count(id) from Agac where dikim_alani_id=8  and agac_turu_id=0 ")
    int doguAnadoluKayin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=8  and agac_turu_id=1 ")
    int doguAnadoluMese();

    @Query("Select Count(id) from Agac where  dikim_alani_id=8  and agac_turu_id=2 ")
    int doguAnadoluCam();

    @Query("Select Count(id) from Agac where  dikim_alani_id=8  and agac_turu_id=3 ")
    int doguAnadoluKavak();

    @Query("Select Count(id) from Agac where  dikim_alani_id=8  and agac_turu_id=4 ")
    int doguAnadoluLadin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=8  and agac_turu_id=5 ")
    int doguAnadoluCeviz();

    @Query("Select  Count(ag.adanan_kisi) from Agac as ag where ag.dikim_alani=8 ")
    int doguAnadoluToplamAgac();

    // DOĞU ANADOLU AĞAÇLAR BİTİŞ





    //--------------------------------------






    //KARADENİZ AĞAÇLAR BAŞLANGIÇ

    @Query("Select Count(id) from Agac where dikim_alani_id=9  and agac_turu_id=0 ")
    int karadenizKayin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=9  and agac_turu_id=1 ")
    int karadenizMese();

    @Query("Select Count(id) from Agac where  dikim_alani_id=9  and agac_turu_id=2 ")
    int karadenizCam();

    @Query("Select Count(id) from Agac where  dikim_alani_id=9  and agac_turu_id=3 ")
    int karadenizKavak();

    @Query("Select Count(id) from Agac where  dikim_alani_id=9  and agac_turu_id=4 ")
    int karadenizLadin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=9  and agac_turu_id=5 ")
    int karadenizCeviz();

    @Query("Select  Count(ag.adanan_kisi) from Agac as ag where ag.dikim_alani=9 ")
    int karadenizToplamAgac();

    // KARADENİZ AĞAÇLAR BİTİŞ


    //-------------------------


    //GÜNEY DOĞU ANADOLU AĞAÇLAR BAŞLANGIÇ

    @Query("Select Count(id) from Agac where dikim_alani_id=7 and agac_turu_id=0 ")
    int gDAnadoluKayin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=7 and agac_turu_id=1 ")
    int gDAnadoluMese();

    @Query("Select Count(id) from Agac where  dikim_alani_id=7 and agac_turu_id=2 ")
    int gDAnadoluCam();

    @Query("Select Count(id) from Agac where  dikim_alani_id=7 and agac_turu_id=3 ")
    int gDAnadoluKavak();

    @Query("Select Count(id) from Agac where  dikim_alani_id=7 and agac_turu_id=4 ")
    int gDAnadoluLadin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=7 and agac_turu_id=5 ")
    int gDAnadoluCeviz();

    @Query("Select  Count(ag.adanan_kisi) from Agac as ag where ag.dikim_alani=7 ")
    int gDAnadoluToplamAgac();

// GÜNEY DOĞU ANADOLU AĞAÇLAR BİTİŞ




//-------------------------



    //AKDENİZ  AĞAÇLAR BAŞLANGIÇ
    @Query("Select Count(id) from Agac where dikim_alani_id=6 and agac_turu_id=0 ")
    int akdenizKayin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=6 and agac_turu_id=1 ")
    int akdenizMese();

    @Query("Select Count(id) from Agac where  dikim_alani_id=6 and agac_turu_id=2 ")
    int akdenizCam();

    @Query("Select Count(id) from Agac where  dikim_alani_id=6 and agac_turu_id=3 ")
    int akdenizKavak();

    @Query("Select Count(id) from Agac where  dikim_alani_id=6 and agac_turu_id=4 ")
    int akdenizLadin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=6 and agac_turu_id=5 ")
    int akdenizCeviz();

    @Query("Select  Count(ag.adanan_kisi) from Agac as ag where ag.dikim_alani=6 ")
    int akdenizToplamAgac();
    //AKDENİZ BİTİŞ




//-------------------------



    //Ege  AĞAÇLAR BAŞLANGIÇ
    @Query("Select Count(id) from Agac where dikim_alani_id=4 and agac_turu_id=0 ")
    int egeKayin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=4 and agac_turu_id=1 ")
    int egeMese();

    @Query("Select Count(id) from Agac where  dikim_alani_id=4 and agac_turu_id=2 ")
    int egeCam();

    @Query("Select Count(id) from Agac where  dikim_alani_id=4 and agac_turu_id=3 ")
    int egeKavak();

    @Query("Select Count(id) from Agac where  dikim_alani_id=4 and agac_turu_id=4 ")
    int egeLadin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=4 and agac_turu_id=5 ")
    int egeCeviz();

    @Query("Select  Count(ag.adanan_kisi) from Agac as ag where ag.dikim_alani=4 ")
    int egeToplamAgac();
    //Ege BİTİŞ




//-------------------------



    //MARMARA AĞAÇLAR BAŞLANGIÇ
    @Query("Select Count(id) from Agac where dikim_alani_id=5 and agac_turu_id=0 ")
    int marmaraKayin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=5 and agac_turu_id=1 ")
    int marmaraMese();

    @Query("Select Count(id) from Agac where  dikim_alani_id=5 and agac_turu_id=2 ")
    int marmaraCam();

    @Query("Select Count(id) from Agac where  dikim_alani_id=5 and agac_turu_id=3 ")
    int marmaraKavak();

    @Query("Select Count(id) from Agac where  dikim_alani_id=5 and agac_turu_id=4 ")
    int marmaraLadin();

    @Query("Select Count(id) from Agac where  dikim_alani_id=5 and agac_turu_id=5 ")
    int marmaraCeviz();

    @Query("Select  Count(ag.adanan_kisi) from Agac as ag where ag.dikim_alani=5 ")
    int marmaraToplamAgac();
//MARMARA BİTİŞ


}

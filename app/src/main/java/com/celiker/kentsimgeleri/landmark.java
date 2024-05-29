package com.celiker.kentsimgeleri;

import java.io.Serializable;

public class landmark implements Serializable {/**bu komutla burada oluşan neseneler,
 serileştirilebilir nesneler olur*/





    String isim;
    String ulke;
    int image; /**android, her görsele int değeri
                         atıyor otomatik olarak. Sen eyfel görürsün o 738593
                         falan görür.*/


    //constructor


    public landmark(String isim, String ülke, int görsel) {
        this.isim = isim;
        this.ulke = ülke;
        this.image = görsel;
    }
}

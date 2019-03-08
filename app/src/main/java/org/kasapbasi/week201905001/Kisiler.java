package org.kasapbasi.week201905001;

public class Kisiler {
    private String Ad;
    private String Soyad;

    public Kisiler(String Ad, String Soyad){
        this.Ad=Ad;
        this.Soyad=Soyad;

    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public String getAd() {
        return Ad;
    }

   @Override
    public String toString(){
       return Ad +" "+Soyad;
    }

}

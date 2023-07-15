package oop01;

public class Hayvan {
 private String isim;

 public Hayvan(String isim){
     this.isim=isim;
 }

 public void beslen (){
     System.out.println(isim+ " beslendi.");
 }

 public void hareketEt(){
     System.out.println( isim + " hareket etti");
 }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

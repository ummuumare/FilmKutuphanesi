package oop01;

public class Kus extends Hayvan {

    private String tur;

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public Kus(String isim) {
        super(isim);
    }

    public void ses(){
        System.out.println(getIsim()+ " oter.");
    }

    @Override
    public void hareketEt() {
        System.out.println(getIsim()+ " ucarak hareket etti. ");
    }
}

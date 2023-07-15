package oop01;

public class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public void beslen() {
        System.out.println(getIsim()+ " kus yiyerek beslendi.");
    }
    public  void ses(){
        System.out.println(getIsim()+ " miyavlandi. ");
    }
}

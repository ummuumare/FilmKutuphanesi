package oop01;

public class Runner {
    public static void main(String[] args) {
        Kus marti = new Kus("Marti");
        marti.beslen();
        marti.hareketEt();
        marti.ses();
        marti.setTur("Marti");
        System.out.println("sultanin turu " + marti.getTur());
        System.out.println("-----------------------");


        Kedi tekir = new Kedi("Duman");
        tekir.beslen();
        tekir.ses();
        tekir.hareketEt();




    }
}
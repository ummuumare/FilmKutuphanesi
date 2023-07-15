package filmOop;

public class Film {
    private String yapimYili;
    private  String yapimYeri;
    private String filmTuru;
    private String filmIsmi;

    public Film(String babamVeOglum, double v, String number, String turkiye, String drama) {
    }

    public Film(String yapimYili, String yapimYeri, String filmTuru, String filmIsmi) {
        this.yapimYili = yapimYili;
        this.yapimYeri = yapimYeri;
        this.filmTuru = filmTuru;
        this.filmIsmi = filmIsmi;
    }

    public String getFilmIsmi() {
        return filmIsmi;
    }

    public void setFilmIsmi(String filmIsmi) {
        this.filmIsmi = filmIsmi;
    }

    public String getYapimYili() {
        return yapimYili;
    }

    public void setYapimYili(String yapimYili) {
        this.yapimYili = yapimYili;
    }

    public String getYapimYeri() {
        return yapimYeri;
    }

    public void setYapimYeri(String yapimYeri) {
        this.yapimYeri = yapimYeri;
    }

    public String getFilmTuru() {
        return filmTuru;
    }

    public void setFilmTuru(String filmTuru) {
        this.filmTuru = filmTuru;
    }

    public void filmBilgileriniYazdir(){
        System.out.println("film adi" + filmTuru);
        System.out.println("film yapim yili: " + yapimYili );
        System.out.println("film yapim yeri: " + yapimYeri );
    }


}

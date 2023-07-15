package filmOop;

public class Runner {
    public static void main(String[] args) {
        Film film = new Film("Babam ve Oglum", 7.8, "2003", "Turkiye", "Drama");
        Film film1 = new Film("Babam ", 7.1, "2006", "Turkiye", "Drama");
        FilmKutuphanesi filmKutuphanesi = new FilmKutuphanesi();
        filmKutuphanesi.filmEkle(film);
        filmKutuphanesi.filmEkle(film1);
        filmKutuphanesi.tumFilmleriListele();
        System.out.println("--------------------");
        filmKutuphanesi.filmArama("babam ve Oglum");
        System.out.println("=====================");
        filmKutuphanesi.filmSil(film1);


    }
}

package filmOop;

import java.util.ArrayList;
import java.util.List;

public class FilmKutuphanesi {
    private List<Film> filmList;

    public FilmKutuphanesi() {
        filmList = new ArrayList<>();
    }

    public void filmEkle(Film film) {
        filmList.add(film);
        System.out.println(film.getFilmIsmi() + " filmi kutuphaneye eklendi.");
    }

    public void filmSil(Film film) {
        filmList.remove(film);
        System.out.println(film.getFilmIsmi() + " filmi kutuphaneden silindi");
    }

    public void filmArama(String filmAdi) {
        boolean bulundu = false;
        for (Film film : filmList) {
            if (film.getFilmIsmi().equalsIgnoreCase(filmAdi)) {
                film.filmBilgileriniYazdir();
                bulundu = true;
            }

        }
        if (!bulundu) {
            System.out.println("film bulunamadi");
        }
    }

    public void tumFilmleriListele() {
        if (filmList.isEmpty()) {
            System.out.println("Kutuphane bos");
        } else {
            for (Film film : filmList) {
                System.out.println("kutuphane listelendi");
            }
        }
    }


}

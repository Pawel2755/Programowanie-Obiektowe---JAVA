public class Film {
    String tytul;
    int czasTrwania;
    String gatunek;

    public Film(String tytul, int czasTrwania, String gatunek) {
        this.tytul = tytul;
        this.czasTrwania = czasTrwania;
        this.gatunek = gatunek;
    }


    public void wyswietlInfo() {
        System.out.println("Film: " + tytul + " (" + czasTrwania + " min, " + gatunek + ")");
    }
}
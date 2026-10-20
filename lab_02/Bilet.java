public class Bilet {
    Seans seans;
    int numerRzedu;
    int numerMiejsca;
    String typBiletu;

    public Bilet(Seans seans, int numerRzedu, int numerMiejsca, String typBiletu) {
        this.seans = seans;
        this.numerRzedu = numerRzedu;
        this.numerMiejsca = numerMiejsca;
        this.typBiletu = typBiletu;


        seans.rezerwujMiejsce();
    }


    public void udzielDostepuNaSale() {
        System.out.println("Bilet " + typBiletu + " na film \"" + seans.film.tytul +
                "\" | Sala: " + seans.salaKinowa.numerSali +
                " | Rząd: " + numerRzedu + ", Miejsce: " + numerMiejsca);
    }
}
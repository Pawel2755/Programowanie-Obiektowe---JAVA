public class SalaKinowa {
    int numerSali;
    int liczbaMiejsc;

    public SalaKinowa(int numerSali, int liczbaMiejsc) {
        this.numerSali = numerSali;
        this.liczbaMiejsc = liczbaMiejsc;
    }


    public void wyswietlInfo() {
        System.out.println("Sala nr " + numerSali + " (Miejsc: " + liczbaMiejsc + ")");
    }
}
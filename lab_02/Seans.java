public class Seans {
    Film film;
    SalaKinowa salaKinowa;
    String dataIGodzinaRozpoczecia;
    int wolneMiejsca;

    public Seans(Film film, SalaKinowa salaKinowa, String dataIGodzinaRozpoczecia) {
        this.film = film;
        this.salaKinowa = salaKinowa;
        this.dataIGodzinaRozpoczecia = dataIGodzinaRozpoczecia;
        this.wolneMiejsca = salaKinowa.liczbaMiejsc;
    }


    public int pobierzIloscDostepnychMiejsc() {
        return wolneMiejsca;
    }


    public boolean rezerwujMiejsce() {
        if (wolneMiejsca > 0) {
            wolneMiejsca--;
            return true;
        }
        return false;
    }
}
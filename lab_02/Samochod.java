public class Samochod {

    String marka;
    String model;
    int rokProdukcji;
    double przebieg;

    public Samochod() {
        this("Nieznana", "Nieznany", 0, 0.0);
    }

    public Samochod(
            String marka,
            String model,
            int rokProdukcji
    ) {
        this(marka, model, rokProdukcji, 0.0);
    }

    public Samochod(
            String marka,
            String model,
            int rokProdukcji,
            double przebieg
    ) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void uruchom() {
        System.out.println(
                marka + " " + model + " został uruchomiony."
        );
    }

    public void przejedz(double kilometry) {
        if (kilometry > 0) {
            przebieg += kilometry;
        }
    }

    public void wyswietlInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg + " km");
    }
}
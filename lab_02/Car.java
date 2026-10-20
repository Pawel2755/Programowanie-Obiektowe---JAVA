public class Car {
    String brand;
    String model;
    int productionYear;
    int mileage;

    public Car() {
        this.brand = "Nieznana";
        this.model = "Nieznany";
        this.productionYear = 0;
        this.mileage = 0;
    }


    public Car(String brand,
               String model
               )
    {
        this.brand = brand;
        this.model = model;
        this.productionYear =2000;
        this.mileage = 45856;
    }
    public Car(String brand, String model, int productionYear, int mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public void drive (double distance) {
        if (distance > 0) {
            mileage += distance;
        }
    }

    public void showInformation(){
        System.out.println("Marka: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Rok produkcji: "+ productionYear);
        System.out.println("Przebieg: "+ mileage);
    }

    public Car(Car other) {
            this.brand = other.brand;
            this.model = other.model;
            this.productionYear = other.productionYear;
            this.mileage = other.mileage;

    }
}
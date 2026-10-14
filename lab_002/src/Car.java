public class Car {
    String brand;
    String model;
    int productionYear;
    int mileage;

        public Car(String brand,
                        String model,
                        int productionYear,
                        int mileage)
        {
            this.brand = brand;
            this.model = model;
            this.productionYear =productionYear;
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
}

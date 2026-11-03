
public class Employee extends Person{
    /*private String position;
    public Employee(String firstName,String lastName,String position) {
        super(firstName, lastName);
        this.position = position;

    }

    public void displayData(){
        //System.out.println(firstName);
        System.out.println("Imię: " + getFirstName());
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Stanowisko: " + position);
    }*/

   /* public void testAccess() {
        // System.out.println(Private);

        // System.out.println(PackagePrivate);

        System.out.println(Protected);

        System.out.println(Public);
    }*/
   private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Metoda wyświetlająca podstawowe dane
    public void showInformation() {
        System.out.println("Pracownik: " + name);
        System.out.println("Wynagrodzenie: " + salary + " PLN");
    }


}
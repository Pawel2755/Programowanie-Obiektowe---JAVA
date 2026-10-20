public class Dog {
    String name;
    String breed;
    int age;

    public Dog(
            String name,
            String breed,
            int age
    ){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void showInformation(){
        System.out.println("Imię: "+name);
        System.out.println("Rasa: "+breed);
        System.out.println("Wiek: "+age);
    }



    public void bark() {
        System.out.println("Wow Wow");
    }
}
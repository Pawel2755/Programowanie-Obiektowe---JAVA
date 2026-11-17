public class Animal {
    private String name = "brak imienia";

    public void makeSound() {
        System.out.println("Zwierzę wydaje dźwięk");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}

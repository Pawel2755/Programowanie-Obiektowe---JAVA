public class Person {

    private String name;
    private int age;
    private String email;

    public Person(String name,int age,String email){
        setName(name);
        setAge(age);
        setEmail(email);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            System.out.println("Name nie może być pusty");
        }
        this.name = name;
    }
    public  void setAge(int age){
        if(age<0 || age > 150){
            System.out.println("Wiek musi być w przedziale od 0 do 100");
        }
        this.age = age;

    }
    public void setEmail(String email){
        if(!email.contains("@")){
            System.out.println("Email musi zawierać @");
        }
        this.email = email;
    }

}

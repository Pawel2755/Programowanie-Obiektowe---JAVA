
public class Person {
    /*private String firstName;
    protected String lastName;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }*/

    private String Private = "private";
    String PackagePrivate = "package-private";
    protected String Protected = "protected";
    public String Public = "public";

    public Person() {}


    public String getPrivate() {
        return Private;
    }
}
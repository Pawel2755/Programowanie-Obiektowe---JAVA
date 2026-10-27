public class User {
    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        setAge(age);
        this.login = login;
        this.password = password;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wiek nie może być ujemny");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void showUser() {
        System.out.println("Login: " + login + ", wiek: " + age  );
    }
}
public class Student extends Person1{
    private int albumNumber;

    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }

    @Override
    public void showInformation() {
        System.out.println("Student: " + getName() + ", album: " + albumNumber);
    }
}

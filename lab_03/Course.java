class Course {
    public static final int DEFAULT_MAX = 30;
    private static int numberOfCreatedCourses = 0;

    private String name;
    private int maxStudents;

    public Course(String name, int maxStudents) {
        if (name == null || maxStudents <= 0){
            System.out.println("Błąd");
        }else {
            this.name = name;
            this.maxStudents = maxStudents;
            numberOfCreatedCourses++;
        }
    }

    public Course(String name) {
        this(name, DEFAULT_MAX);
    }

    public static int getNumberOfCreatedCourses()
    {
        return numberOfCreatedCourses;
    }

    public String getName()
    {
        return name;
    }
}
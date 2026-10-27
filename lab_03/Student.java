class Student {
    public static final int MIN_ALBUM_LEN = 4;
    private String name;
    private String albumNumber;

    public Student(String name, String albumNumber) {
        setName(name);
        setAlbumNumber(albumNumber);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.out.println("Imię nie może być puste");
        }else{
            this.name = name;
        }
    }

    public String getAlbumNumber() {
        return albumNumber;
    }
    public void setAlbumNumber(String albumNumber) {
        if (albumNumber == null || albumNumber.length() < MIN_ALBUM_LEN){
            System.out.println("Numer albumu jest zbyt krótki");
        }
        else {
            this.albumNumber = albumNumber;
        }
    }
}
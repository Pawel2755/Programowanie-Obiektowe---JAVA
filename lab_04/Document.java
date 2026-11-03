public class Document {
    private String title;

    public Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Document copy() {
        System.out.println("Kopiowanie");
        return new Document(this.title);
    }
}

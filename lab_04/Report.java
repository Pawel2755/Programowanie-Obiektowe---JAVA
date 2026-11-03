public class Report extends Document{
    private int pageCount;

    public Report(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
    @Override
    public Report copy() {
        System.out.println("Kopiowanie");
        return new Report(getTitle(), this.pageCount);
    }
}

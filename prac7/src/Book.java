public class Book implements PrintBook {
    private String title;
    private String author;
    private int year;
    private boolean burnedByInquisition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBurnedByInquisition() {
        return burnedByInquisition;
    }

    public void setBurnedByInquisition(boolean burnedByInquisition) {
        this.burnedByInquisition = burnedByInquisition;
    }

    @Override
    public void print() {
        System.out.println("Title: " + title);
    }
}
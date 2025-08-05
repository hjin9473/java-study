package homework13;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String category;
    private int price;

    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "[제목: " + title + ", 저자: " + author + ", 장르: " + category + ", 가격: " + price + "]";
    }

    
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}

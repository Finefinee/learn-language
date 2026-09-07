package amiddle.classs;

public class ClassElementEx3 {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();
        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();
        Book book3 = new Book("JPA", "kim", 700);
        book3.displayInfo();
    }
}


class Book {

    String title;
    String author;
    int page;

    public Book() {
        this.page = 0;
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.page = 0;
    }

    public void displayInfo() {
        System.out.printf("제목: %s, 저자: %s, 페이지: %d원", this.title, this.author, this.page);
    }
}
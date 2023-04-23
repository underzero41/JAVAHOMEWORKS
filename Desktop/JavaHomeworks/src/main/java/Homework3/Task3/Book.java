package Homework3.Task3;

public class Book {
    String bookName;
    String authorName;
    Integer price;
    Integer yearOfPublishing;
    Integer pages;

    public Book(String bookName, String authorName, Integer price, Integer yearOfPublishing, Integer pages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getYearOfPublishing() {
        return yearOfPublishing;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book Name='" + bookName + '\'' +
                ", author Name ='" + authorName + '\'' +
                ", price=" + price +
                ", year of publishing=" + yearOfPublishing +
                ", pages=" + pages +
                '}';
    }
}

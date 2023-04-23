package Homework3.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<Book> books = getBook();
        ArrayList<String> bookNames = new ArrayList<String>();
        for (Book book: books){
            if(book.getAuthorName().toUpperCase().contains("A") && isPrime(book.getPages()) && book.getYearOfPublishing() >= 2010){
                bookNames.add(book.getBookName());
            }
        }
        for(String bookName: bookNames){
            System.out.println(bookName);
        }
    }

    /**
     *
     * @param number prime
     * @return prime numbers
     */
    private static boolean isPrime(int number) {
        if(number < 2){
            return false;
        }
        for (int i = 2; i*i < number; i++) {
            if(number % i == 0){
                return  false;
            }
        }
        return true;
    }

    /**
     *
     * @return book from the list
     */
    private static ArrayList<Book> getBook() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Alice in wonderland", "Ivan Petrov", 300, 2008, 340));
        books.add(new Book("Lord of the ring", "John Tolkien", 400, 1954, 800));
        books.add(new Book("Dark Matters", "Philipp Pullman", 550, 2010, 641));
        books.add(new Book("Jane Air", "Sharlotta Bronte", 330, 2012, 719));
        books.add(new Book("Bird's songs", "Sebastian Folks", 200, 1985, 940));
        books.add(new Book("Peace and War", "Lev Tolstoy", 1000, 1865, 1200));
        return books;
    }
}

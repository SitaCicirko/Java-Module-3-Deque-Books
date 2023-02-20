import java.util.*;
import java.lang.*;
class Book {
    String title;
    String author;
    int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String toString() {
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }
    public String  getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
}
class OrdersQueue {

    public static void main (String[] args) throws java.lang.Exception {

        Book theBook1 = new Book("Zorro", "Isabel Allende", 1919 );
        Book theBook2 = new Book("The da Vinci code", "Dan Brown", 2003);
        Book theBook3 = new Book("Earthsea", "Ursula Le Guin", 1968);
        Book theBook4 = new Book("Homo Deus", "Yuval Noah Harari", 2015);
        Book theBook5 = new Book("Dune","Frank Herbert",1965);

        Deque<Book> theBooks = new ArrayDeque<>();

        System.out.println("Books list. It's size: " + theBooks.size());
        theBooks.offer(theBook1);
        theBooks.offer(theBook2);
        theBooks.offer(theBook3);
        theBooks.offer(theBook4);
        theBooks.offer(theBook5);

        System.out.println("Books list is filled. It's size: " + theBooks.size());//2

        for(Book tb : theBooks){
            System.out.println(tb);
        }
        Book lastBook = null;
        while (!theBooks.isEmpty()){
            lastBook = theBooks.pop();
        }
        System.out.println("Last book: " + lastBook);
        System.out.println("List is emptied. It's size: " + theBooks.size());
    }
}
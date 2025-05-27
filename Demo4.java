package book;

class Book{
    String bookname;
    String author;
    String publisher;
    double price;
    int year_of_published;

    Book(String bookname, String author, String publisher, double price, int year_of_published){
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.year_of_published = year_of_published;
    }

    public void display(){
        System.out.println("BookName: " +bookname);
        System.out.println("Book Author: " +author);
        System.out.println("Book Publisher: " +publisher);
        System.out.println("Book Price: " +price);
        System.out.println("Year of published: " +year_of_published);
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K Rowling", "June", 400, 2000);
        b1.display();

        BookSales b2 = new BookSales("Sapna Book Stall", 20, "Boo1");
        b2.show();

        System.out.println("end of the program");
    }
}

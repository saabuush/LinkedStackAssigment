package ExamplesChap9;

public class book {
    //variables
    String title, author;
    int year, quantity;

    //constructors
    book() {
        title = "C#";
        author = "john";
        year = 2020;
        quantity = 1;
    }
    book(String title, String author, int year, int quantity) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.quantity = quantity;
    }

    //methods
    void addBook(int value) {
        quantity += value;
    }

    void setTitle(String newTitle) {
        title = newTitle;
    }

    boolean searchBook(String searchTitle) {
        if(title ==searchTitle)
            return true;
        return false;
    }

    void showInformation(){
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book quantity: " + quantity);
        System.out.println("book year: " + year);
    }

    void borrowBook(){
        if(quantity > 0)
            quantity--;
        else
            System.out.println("Error! Book quantity: " + "zero(0)");
    }


//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", year=" + year +
//                ", quantity=" + quantity +
//                '}';
//    }

    //main method
    public static void main(String[] args) {
        book book = new book("java","James Cosling",2009 , 2);
        book.borrowBook();
        book.showInformation();
        book.borrowBook();
    }

}

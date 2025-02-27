package Practice_problem06;

import java.util.*;

class Books {
    int Bookid;
    String BookName;
    String BookAuthor;
    String YearPub;
    float Price;
    String Status;
    
    Books(int Bookid,String BookName,String BookAuthor,String YearPub,float Price,String Status) {
        this.Bookid=Bookid;
        this.BookName=BookName;
        this.BookAuthor=BookAuthor;
        this.YearPub=YearPub;
        this.Price=Price;
        this.Status=Status;
    }

    void AddNewBooks() {
        System.out.println("New book "+BookName+" is added");
    }

    void DeleteBooks() {
        System.out.println(BookName+" is deleted");
    }

    void DisplayBookDetails() {
        System.out.println("Book name : "+BookName+" with id : "+Bookid+" ,written by : "+BookAuthor);
        System.out.println("Publication year : "+YearPub+",Price : "+Price+" taka");
    }

    void InquiryBook() {
        System.out.println("Inquiring about : "+BookName+" with id : "+Bookid);
    }
}

class Librarian {
    int id;
    String name;

    Librarian(int id,String name) {
        this.id=id;
        this.name=name;
    }

    void SearchBook(String name) {
        System.out.println("Searching book : "+name);
    }

    boolean VerifyMember(int id) {
        System.out.println("Verifying membership for User Id : "+id);
        return true;
    }

    void OrderBook() {
        System.out.println("Ordering Book : "+name);
    }

    void SellBook() {
        System.out.println("Selling Book : "+name);
    }
}

class Publisher {
    int id;
    String name;
    String Address;
    int phoneNo;
    
    Publisher(int id,String name,String Address,int phoneNo) {
        this.id=id;
        this.name=name;
        this.Address=Address;
        this.phoneNo=phoneNo;
    }

    void AddPub() {
        System.out.println("Adding new publisher : "+name);
    }
    void ModifyPub() {
        System.out.println("Modifying publisher details of "+name);
    }
    void DeletePub() {
        System.out.println("Deleting info of publisher : "+name);
    }
    void OrderStatus() {
        System.out.println("Checking order status of "+name+"'s book.");
    }
}

class User{
    int UserId;
    String UserName;
    String UserAddress;
    int PhoneNo;

    User(int UserId,String UserName,String UserAddress,int PhoneNo) {
        this.UserId=UserId;
        this.UserName=UserName;
        this.UserAddress=UserAddress;
        this.PhoneNo=PhoneNo;
    }
    void ReturnBook() {
        System.out.println("Returning book by user : "+UserName+" with id : "+UserId);
    }
    int PayFine(int date) {
        System.out.println("Paying fine for "+date+" days delay.");
        System.out.println("Fine is "+date*5+" taka");
        return date*5;
    }
    void AddNewUser() {
        System.out.println("Adding new user : "+UserName+" with id : "+UserId);
    }
    void DeleteUser() {
        System.out.println("Deleting user : "+UserName);
    }
    void UpdateDetails() {
        System.out.println("Updating details of user : "+UserName);
    }
    void BookPurchase() {
        System.out.println(UserName+" is buying a book.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Books book=new Books(1, "Java Programming", "Author X", "2020", 499.99f, "Available");
        book.DisplayBookDetails();

        Librarian librarian=new Librarian( 281371, "Maha");
        librarian.SearchBook("Java Programming");
        
        Publisher publisher=new Publisher(30231, "XYZ Publishers", "456 Avenue", 987654321);
        publisher.OrderStatus();

        User user=new User(34201, "Sami", "123 Street", 123456789);
        user.BookPurchase();
        user.PayFine(7); 
}
}
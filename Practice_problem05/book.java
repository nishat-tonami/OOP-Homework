package Practice_problem05;

public class book {
    private String title;
    private String author;

    public book(String title) {
        this.title = title;
        author="NULL";
    }

    public book(String title,String author) {
        this.title=title;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println("Title: "+title);
        System.out.println("Author: " +author);
    } 
    
    public static void main (String [] args) {
         book book1=new book("1984"); 
         book book2=new book("To Kill a Mockingbird","Harper Lee");
         book1.displayInfo();
         book2.displayInfo();
    }
    
}

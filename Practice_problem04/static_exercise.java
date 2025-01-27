package Practice_problem04;

import java.util.Scanner;

class Library {
    private static int totalBooksIssued=0;
    public static void issueBook () {
        totalBooksIssued++;
    }
    public static int totalNumber() {
        return totalBooksIssued;
    }
}

public class static_exercise {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books you want to issue : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            Library.issueBook();
        }
        System.out.println("Total books issued : "+Library.totalNumber());
        sc.close();
    }
}

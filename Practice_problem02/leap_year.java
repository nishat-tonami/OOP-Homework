package Practice_problem02;
import java.util.Scanner;

public class leap_year {
    public static void main(String [] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Year : ");
     int year=sc.nextInt();
     Boolean flag=false;
     if(year%4==0 || year%400==0) flag=true;
     if(flag) System.out.println("It's a leap year!");
     else System.out.println("It's not a leap year!");
     sc.close();
    }
}

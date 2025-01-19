package Practice_problem03;
import java.util.Scanner;

public class letter_grade {
    public static void main (String [] args) {
       java.util.Scanner sc=new Scanner(System.in);
       System.out.println("Enter your grade : ");
       double grade=sc.nextDouble();
       System.out.println("Completed semester or not? If yes type 1,else type 0 ");
       int flag=sc.nextInt();
       if(flag==1 && grade>=3.5) System.out.println("You deserve a medal!");
       else System.out.println("Sorry,you failed the criterias!");
       sc.close();
    }
}

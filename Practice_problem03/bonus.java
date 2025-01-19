package Practice_problem03;
import java.util.Scanner;

public class bonus {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target sales : ");
        int target=sc.nextInt();
        System.out.println("Enter attendance : ");
        int attendance=sc.nextInt();
        if(target>=95 && attendance==100) System.out.println("60% bonus");
        else if(target>=95 && attendance>=90) System.out.println("40% bonus");
        else if(target>=80 && attendance==100) System.out.println("40% bonus");
        else if(target>=80 && attendance>=90) System.out.println("20% bonus");
        else System.out.println("5% bonus");
        sc.close();
    }
}

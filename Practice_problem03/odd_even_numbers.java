package Practice_problem03;
import java.util.Scanner;

public class odd_even_numbers {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size_n=sc.nextInt();
        int a[]=new int[size_n];
        for(int i=0;i<size_n;i++) a[i]=sc.nextInt();
        int odd=0,even=0;
        for(int i=0;i<size_n;i++) {
            if(a[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Total odd numbers : "+odd);
        System.out.println("Total even numbers : "+even);
        sc.close();
    }
}

package Practice_problem03;
import java.util.Scanner;


public class prime_number { 

    public static boolean is_prime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        if(is_prime(n)) System.out.println("Prime number!");
        else System.out.println("Not a prime number!");
        sc.close();
    }
}

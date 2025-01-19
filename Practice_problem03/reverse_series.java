package Practice_problem03;
import java.util.Scanner;

public class reverse_series {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size_n=sc.nextInt();
        double a[]=new double[size_n];
        for(int i=0;i<size_n;i++) a[i]=sc.nextDouble();
        System.out.println("Reverse order of the array :");
        for(int i=size_n-1;i>=0;i--) System.out.print(a[i]+" ");
        sc.close();
    }
}

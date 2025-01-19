package Practice_problem03;
import java.util.Scanner;

public class greatest_number {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size_n=sc.nextInt();
        double [] a=new double [size_n];
        for(int i=0;i<size_n;i++) {
            a[i]=sc.nextDouble();
        }
        double max=a[0];
        for(int i=1;i<size_n;i++){
            if(a[i]>a[i-1]) max=a[i];
        }
        System.out.println("Maximum number of the array is : "+max);
        sc.close();
    }
}

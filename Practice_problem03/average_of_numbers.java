package Practice_problem03;
import java.util.Scanner;

public class average_of_numbers {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size_n=sc.nextInt();
        double sum=0;
        double [] a=new double[size_n];
        for(int i=0;i<size_n;i++) {
            a[i]=sc.nextDouble();
            sum+=a[i];
        }
        double ans=sum/size_n;
        System.out.println(ans);
        sc.close();
    }
}

package Practice_problem03;
import java.util.Scanner;

public class fibonacci_series {
    public static void main (String [] args) {
        int n1=0,n2=1;
        System.out.print(n1+", "+n2);
        int n3;
        while(true) {
            n3=n1+n2;
            if(n3>89) break;
            System.out.print(", "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

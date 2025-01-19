package Practice_problem02;

public class sum_of_series {
    public static void main (String [] args) {
        int sum1=0,sum2=0;
        for(int i=2;i<22;i+=2) {
            sum1+=i;
        }
        for(int i=1;i<21;i+=2) {
            sum2+=i;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}

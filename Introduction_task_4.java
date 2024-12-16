import java.util.Scanner;

public class Introduction_task_4 {

    public static void main(String [] args) {
    //Convert Celsius scale to Fahrenheit: C / 5 = (F - 32) / 9
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter temperature :"); 
      double temp=sc.nextDouble();
      double f_temp=((9.0*temp)/5.0)+32.0;
      System.out.println("Temperature is : "+f_temp);
      sc.close();
    }
}
// (C/5)*9=F-32
// ((9*C)/5)+32 = F
import java.util.Scanner;

public class Introduction_task_2  {

    public static void main(String [] args) {
    //Find the volume of a ball: 4/3 * pi * radius^3
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius :"); 
      double radius=sc.nextDouble();
      double volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
      System.out.println("Volume is : "+volume);
      sc.close();
    }
}

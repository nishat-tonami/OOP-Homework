import java.util.Scanner;

public class Introduction_task_3 {

    public static void main(String [] args) {
    //Find the area of a circle: pi * radius^2
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius :"); 
      double radius=sc.nextDouble();
      double area=Math.PI*Math.pow(radius,2);
      System.out.println("Area is : "+area);
      sc.close();
    }
}

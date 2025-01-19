import java.util.Scanner;

public class Introduction_task_5 {

    public static void main(String [] args) {
    //Find the area of a equilateral triangle: (√3 / 4) * arm^2
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter length :"); 
      double arm=sc.nextDouble();
      double area=(Math.sqrt(3)/4)*Math.pow(arm,2);
      System.out.println("Area is : "+area);
      sc.close();
    }
}

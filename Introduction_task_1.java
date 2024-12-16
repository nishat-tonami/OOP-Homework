import java.util.Scanner;

public class Introduction_task_1 {
    public static void main(String [] args) {
        //Find the area of a triangle : 0.5 * base * height
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter base :"); 
          double base=sc.nextDouble();
          System.out.println("Enter height :");
          double height=sc.nextDouble();
          double area=0.5*base*height;
          System.out.println("Area is : "+area);
          sc.close();
        }
}

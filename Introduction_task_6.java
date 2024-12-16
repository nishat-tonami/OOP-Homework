import java.util.Scanner;

public class Introduction_task_6 {

    public static void main(String [] args) {
    //Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c))  where s = (a+b+c) / 2
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter side a :"); 
      double a=sc.nextDouble();
      System.out.println("Enter side b :"); 
      double b=sc.nextDouble();
      System.out.println("Enter side c :"); 
      double c=sc.nextDouble();
      double s=(a+b+c)/2;
      double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Area is : "+area);
      sc.close();
    }
}

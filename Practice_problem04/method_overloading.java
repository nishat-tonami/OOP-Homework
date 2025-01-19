package Practice_problem04;
import java.util.Scanner;


public class method_overloading {
    public static void filterProducts(String category) {
        System.out.println("Category : "+category);
    }
    public static void filterProducts(double min_price,double max_price) {
        System.out.println("Price range : $"+min_price+" - $"+max_price);
    }
    public static void filterProductsBrand(String brand) {
        System.out.println("Brand : "+brand);
    }
    public static void filterProducts(String category,double min_price,double max_price) {
        System.out.println("Category of the product is "+category+" & price range is : $"+min_price+" - $"+max_price);
    }
    public static void filterProducts(String category,double min_price,double max_price,String brand) {
        System.out.println("Category of the product is "+category+" & price range is : $"+min_price+" - $"+max_price);
        System.out.println("The brand is : "+brand);
    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How do you want to filter your products?");
        System.out.println("Type 1 if you want to filter it through only catergory.");
        System.out.println("Type 2 if you want to filter it through only price range.");
        System.out.println("Type 3 if you want to filter it through only brand name.");
        System.out.println("Type 4 if you want to filter it through category & price range.");
        System.out.println("Type 5 if you want to filter it through category,price range & brand name.");
        int n=sc.nextInt();
        sc.nextLine();
        if(n==1) {
            System.out.println("Enter category : ");
            String s=sc.nextLine();
            filterProducts(s);
        }
        if(n==2) {
            System.out.println("Enter min price : $");
            double minPrice=sc.nextDouble();
            System.out.println("Enter max price : $");
            double maxPrice=sc.nextDouble();
            filterProducts(minPrice, maxPrice);
        }
        if(n==3) {
            System.out.println("Enter brand name : ");
            String s=sc.nextLine();
            filterProductsBrand(s);
        }
        if(n==4) {
            System.out.println("Enter category : ");
            String s=sc.nextLine();
            System.out.println("Enter min price : $");
            double minPrice=sc.nextDouble();
            System.out.println("Enter max price : $");
            double maxPrice=sc.nextDouble();
            filterProducts(s,minPrice,maxPrice);
        }
        if(n==5) {
            System.out.println("Enter category : ");
            String s1=sc.nextLine();
            System.out.println("Enter min price : $");
            double minPrice=sc.nextDouble();
            System.out.println("Enter max price : $");
            double maxPrice=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter brand name : ");
            String s2=sc.nextLine();
            filterProducts(s1,minPrice,maxPrice,s2);
        }
        System.out.println("Thank you for using this filter service!");
        sc.close();
    }
 }

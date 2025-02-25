package Exercise;

import java.util.Scanner;

class FoodOrderingSystem {
    String [] foods={"Burger","Pizza","French fries","Pasta","Polao","Chicken fries","Potato wedges","Waffle","Pancake","Biriyani"};
    double [] prices={5.99,8.99,3.2,5.45,7.5,4.8,3.2,5.5,5.4,8.0};
    double totalCost=0;
    void food(String food,double price,int quantity) {
      double cost=quantity*price;
       System.out.println("You chose the food : "+food+" ,priced at : "+price+"$ ,quantity : "+quantity);
       System.out.println("Total cost for this item is "+quantity*price+"$");
       totalCost+=cost;
    }
    void menu(){
      System.out.println("The menu is listed below : ");
      for(int i=0;i<10;i++) {
        System.out.println((i+1)+". "+foods[i]+" - $"+prices[i]);
      }
    }
    void takeOrder() {
      Scanner sc=new Scanner(System.in);
      menu();
      System.out.println("How many different type of food item do you want to order?");
      int type=sc.nextInt();
      for(int i=0;i<type;i++) {
      System.out.println("Choose food item and type the corresponding number : ");
      int choice=sc.nextInt();
      System.out.print("Enter quantity: ");
      int quantity=sc.nextInt();

      String foodItem=foods[choice-1];
      double foodPrice=prices[choice-1];
      food(foodItem,foodPrice,quantity);
      }
    }
    void generateBill(String name,String address) {
      System.out.println("===== BILL =====");
      System.out.println("Customer name : "+name);
      System.out.println("Address : "+address);
      System.out.println("Total cost: $"+totalCost);
      System.out.println("Thank you for ordering!");

    } 
}

public class ClassTask01 {
     public static void main(String[] args) {
        FoodOrderingSystem order = new FoodOrderingSystem();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s1=sc.nextLine();
        System.out.print("Enter your address: ");
        String s2=sc.nextLine();
        order.takeOrder();
        order.generateBill(s1,s2);
        sc.close();
    }
}
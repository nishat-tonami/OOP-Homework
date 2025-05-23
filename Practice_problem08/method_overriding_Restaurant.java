package Practice_problem08;

class Restaurant {
    
    String name;

    Restaurant(String name) {
        this.name=name;
    }
    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo() {
        System.out.println(this.name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
    }

    double tax() {
        return 0.10*100;
    }
    double food() {
        return 100+tax();
    }
    void calculateTotalBill() {
        System.out.println("The bill is "+food());
    }

}

class FastFoodRestaurant extends Restaurant {
    
    FastFoodRestaurant(String name) {
        super(name);
    }

    int estimateDeliveryTime() {
        return 20;
    }
    double tax() {
        return 0.15*75;
    }
    double food() {
        return 75+tax();
    }
}

class FineDiningRestaurant extends Restaurant {

    FineDiningRestaurant(String name) {
        super(name);
    }

    int estimateDeliveryTime() {
        return 60;
    }
    double food() {
        int taxRate=200/100;
        return 200+taxRate*tax();
    }
}

public class method_overriding_Restaurant {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant("Normal ");
        FastFoodRestaurant fastFood = new FastFoodRestaurant("Fast Food ");
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Luxury Food ");

        genericRestaurant.displayInfo();
        genericRestaurant.calculateTotalBill();
        fastFood.displayInfo();
        fastFood.calculateTotalBill();
        fineDining.displayInfo();
        fineDining.calculateTotalBill();
    }
}
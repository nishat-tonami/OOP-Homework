package Practice_problem05;

public class pet {
    private String name;
    private int age;
    private String breed;

    pet(String name,int age,String breed) {
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    
    void bark() {
        System.out.println("Woof woof!");
    }

    void spin() {
        System.out.println("The dog is doing a spin!");
    }

    void run() {
        System.out.println("The dog is running!");
    }

    void printInfo() {
        System.out.println("The dogs name is "+name+" & age is "+age+".The breed of the dog is "+breed);
    }

    public static void main (String [] args) {
        pet dog = new pet("Goldie",3,"golden retriever");
        dog.printInfo();
        dog.bark();
        dog.spin();
        dog.run();
    }
}

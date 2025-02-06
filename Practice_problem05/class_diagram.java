package Practice_problem05;

class Employee {
    String name;
    int id;
    String department;
    void calculatePay() {
        System.out.println(name+" with ID : "+id+" of department : "+department+" has a salary of ");
    }
}

class FullTimeEmployee extends Employee {
    double fixedSalary;
    void calculatePay () {
        System.out.println(name+" with ID : "+id+" of department : "+department+" has a salary of "+fixedSalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    void calculatePay () {
        System.out.println(name+" with ID : "+id+" of department : "+department+" has a salary of "+hourlyRate*hoursWorked);
    }
}

class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;
    void calculatePay() {
        System.out.println(name+" with ID : "+id +" of department : "+department+" has a contract amount of "+contractAmount+" for "+projectName);
    }
}
public class class_diagram {
    public static void main(String [] args) {
      FullTimeEmployee obj1 = new FullTimeEmployee();
      obj1.name="Fardin";
      obj1.id=20229374;
      obj1.department="Accounting";
      obj1.fixedSalary=50000;

      PartTimeEmployee obj2 = new PartTimeEmployee();
      obj2.name="Hasan";
      obj2.id=20229395;
      obj2.department="HR";
      obj2.hourlyRate=25;
      obj2.hoursWorked=26;

      ContractEmployee obj3 = new ContractEmployee();
      obj3.name="Maha";
      obj3.id=20229352;
      obj3.department="IT";
      obj3.projectName="Project X";
      obj3.contractAmount=100000;

      obj1.calculatePay();
      obj2.calculatePay();
      obj3.calculatePay();
    }
}

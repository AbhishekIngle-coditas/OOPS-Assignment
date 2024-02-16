package Practice.Question_Employee;

// Employee class
class Employee {
    String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double salary;
    private String benefits;

    // Constructor
    public FullTimeEmployee(String name, int id, double salary, String benefits) {
        super(name, id);
        this.salary = salary;
        this.benefits = benefits;
    }

    // Method to override calculateSalary for full-time employees
    public void calculateSalary() {
        System.out.println("Salary of Full Time Employee " + super.name + " is: " + salary);
    }

    // Method to display full-time employee details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Full Time");
        System.out.println("Salary: " + salary);
        System.out.println("Benefits: " + benefits);
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Method to override calculateSalary for part-time employees
    public void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Salary of Part Time Employee " + super.name + " is: " + salary);
    }

    // Method to display part-time employee details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Part Time");
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}

// TestEmployee class
public class TestEmployee {
    public static void main(String[] args) {
        // Creating instances of FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 101, 50000, "Health Insurance");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 102, 20, 40);

        // Demonstrating inheritance
        fullTimeEmployee.displayDetails();
        System.out.println("------------------------");
        partTimeEmployee.displayDetails();

        // Calling methods from both superclass and subclasses
        fullTimeEmployee.calculateSalary();
        partTimeEmployee.calculateSalary();
    }
}

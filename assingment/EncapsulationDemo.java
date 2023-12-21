package assingment;
class Employee {

    private int salary;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
            this.salary = salary;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}


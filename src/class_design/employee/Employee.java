package class_design.employee;

public class Employee {
    String name;
    boolean contract;
    double salary;
    Employee(){

    }

    public String toString(){
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Joe";
        e.contract = true;
        e.salary = 100;
        System.out.println(e);
    }
}

package constractors;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee() {

    }

    public void printDetails(){
        System.out.println(name + " : " + age + " : " + salary );
    }
}

package constractors;

import java.time.Period;

public class Person {
    String name;
    int age = 25;

    Person (String name) {
        this.name = name;
    }

    public Person(String name, int age) {
       new Person(name); // Person(name) DOES NOT COMPILE
        this.age = age;
    }

    public String show(){
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}

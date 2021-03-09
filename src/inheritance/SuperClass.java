package inheritance;

import inheritance.sub.SubClass;

public class SuperClass {
    protected void display(){
        System.out.println("SuperClass.display()");
    }

    //Method overloading of static method
    public void display(int a){
        System.out.println("SuperClass.display(int): " + a);
    }
}


class Tester {
    public static void main(String[] args) {
        SuperClass object = new SubClass();

        //SuperClass display method is called
        //although object is of SubClass.
        object.display(); // metodlar object tipine gore cagirir
        object.display(1);
    }
}

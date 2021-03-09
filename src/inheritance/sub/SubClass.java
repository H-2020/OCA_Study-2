package inheritance.sub;

import inheritance.SuperClass;

public class SubClass extends SuperClass {
    //Not method overriding but hiding
    public void display(){
        System.out.println("SubClass.display()");
    }

    public static void main(String[] args) {
        SuperClass object = new SubClass();

        //SuperClass display method is called
        //although object is of SubClass.
   //     object.display(); // metodlar object tipine gore cagirir
        object.display(1);
    }
}

class School {

    public static void main(String[] args) {
        SuperClass object = new SubClass();
        //SuperClass.display(); // metodlar object tipine gore cagirir
    //    object.display();
    }

    public void test(){
        SuperClass object = new SubClass();
        //SuperClass.display(); // metodlar object tipine gore cagirir
    //    object.display();
    }

}

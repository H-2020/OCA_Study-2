package stringbuilder;

public class Example03 {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java"));
        System.out.println("Hello " + new MyString("Java"));
    }
}

class MyString{
    String msg;

    public MyString(String msg) {
        this.msg = msg;
    }


}

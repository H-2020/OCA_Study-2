package oca_intec.q13.testPackage;

class Test {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.println(Other.hello == hello);
        System.out.println(hello == "Hel" + lo );
        System.out.println(hello == ("Hel" + lo ).intern());
        System.out.println(hello == "Hel" + "lo");

    }
}

class Other {
    static String hello = "Hello";
}

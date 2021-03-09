package class_design.static_instance_relations;

public class App2 {
    public static int stVar = 100;
    public int var = 200;
    public String toString(){
        return stVar + ":" + var;
    }

    public static void main(String[] args) {
        App2 t1 = new App2();
        t1.var = 300;
        System.out.println(t1);

        App2 t2 = new App2();
        t2.stVar = 300;
        System.out.println(t2);
    }
}

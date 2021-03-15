package java_building_blocks.example01;

public class Triangle {
    static double area;
    int b = 2, h = 3;

    public static void main(String[] args) {
        double p, b, h;
        if(area == 0){
            b = 3;
            h = 4;
            p = 0.5;
        }
    //    area = p * b * h; VARIABLES MAY NOT BE INITIALIZED
        System.out.println("Area is " + area);
    }
}

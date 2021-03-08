package class_design.ternary_operator;

public class Main2 {
    public static void main(String[] args) {
        double discount = 0;
        int qty = Integer.parseInt("85");

        if(qty > 80 && qty < 90){
            discount = 0.2;
        } else {
            discount = 0;
        }

        if(qty >= 90){
            discount = 0.5;
        } else discount = 0;

        System.out.println(discount);
    }
}

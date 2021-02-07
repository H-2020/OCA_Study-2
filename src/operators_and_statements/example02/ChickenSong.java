package operators_and_statements.example02;

public class ChickenSong {
    public static void main(String[] args) {
        HenHouse house = new Chicken();

        Chicken chicken = house.getChickens().get(0);

        for (int i = 0; i < house.getChickens().size();
        chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
        }
    }
}

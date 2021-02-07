package operators_and_statements.example02;

import java.util.ArrayList;
import java.util.List;

public class Chicken implements HenHouse{
    private List<Chicken> chickenList;

    public Chicken() {
        this.chickenList = new ArrayList<>();
    }

    @Override
    public List<Chicken> getChickens() {
        return List.of(new Chicken());
    }
}

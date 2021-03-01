package class_design.example03;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FindAllTadPole {
    public static void main(String[] args) {
        List<TadPole> tadPoleList = new ArrayList<TadPole>();
        for (Amphibian amphibian: tadPoleList){
            TadPole tadpole = (TadPole) amphibian;
        }
    }
}

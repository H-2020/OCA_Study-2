package java_building_blocks.example01;

public class Primitives {
    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;

        fVar = iVar;
   //     iVar = fVar; COMPILE ERROR
   //     fVar = dVar; COMPILE ERROR
        dVar = fVar;
   //      iVar = dVar; COMPILE ERROR
        dVar = iVar;
    }
}

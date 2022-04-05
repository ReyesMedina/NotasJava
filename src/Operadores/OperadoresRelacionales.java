package Operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        //Operadores Relacioneles en datos primitivos

        int i = 32;
        byte e = 1;
        float b = 323.23f;

        boolean comprobacion1 = i==e; // i es igual a e; no : entonces comprobacion1 es false
        System.out.println("comprobacion1 = " + comprobacion1);

        boolean comprobacion2 = i>e; // i es mayor a e; si : entonces comprobacion2 es true
        System.out.println("comprobacion2 = " + comprobacion2);

        boolean comprobacion3 = !comprobacion1; // en esta caso comprobacion1 no es verdadero; verdadero
        System.out.println("comprobacion3 = " + comprobacion3);

        boolean comprobacion4 = i!=e; // i no es igual a e; verdadero : entonces comprobacion4 es true
        System.out.println("comprobacion4 = " + comprobacion4);






    }
}

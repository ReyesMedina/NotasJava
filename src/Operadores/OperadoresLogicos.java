package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        ///And con && en este caso ambas comprobaciones deben ser verdaderas para retornar verdadero
        // Cuando se especifica un && si la primera es falsa ya no se comprueba la segunda
        boolean b1 = i==j && k>l;
        System.out.println("b1 = " + b1);

        //Operacion logica OR ||
        //Solo se necesita que una sea verdadera para retornar verdadero
        boolean b2 = i!=j || k>l;
        System.out.println("b2 = " + b2);


    }
}

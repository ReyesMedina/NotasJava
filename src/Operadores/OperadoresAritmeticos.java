package Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i=10, j=5;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //operador suma
        int suma = i +j;
        System.out.println("suma de " + i +" + "+ j + " = " + suma);
        //operador resta
        int resta = i - j;
        System.out.println("resta de " + i +" - "+ j + " = " + resta);
        //operador multiplicacion
        int multiplicacion = i*j;
        System.out.println("multiplicacion de " + i +" * "+ j + " = " + multiplicacion);
        //operador division
        int division = i/j;
        System.out.println("division de " + i +" / "+ j + " = " + division);
        //operador modulo
        int modulo = i%j;
        System.out.println("Modulo de " + i +" % "+ j + " = " + modulo);

    }
}

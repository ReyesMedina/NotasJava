package TareasProyectos;

import java.util.Scanner;

public class NumeroMenor {
    //Tarea 7
    /*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10
     valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar,
     luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir
     el numero entero, entonces se requiere:
    Calcular el menor número e imprimir el valor.
    Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
    si no, imprimir " el numero menor es igual o mayor que 10!".*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumeros=0;
        System.out.println("Introduza la cantidad de numeros que desea comparar : ");
        totalNumeros = scanner.nextInt();
        int numeromenor = Integer.MAX_VALUE;

        if(totalNumeros<10){
            System.out.println("Error deben ser minimo 10 numeros");
        }
        else
        {
            for(int i=1;i<=totalNumeros;i++){
                System.out.println("Introduzca el numero " + i);
                int numero=scanner.nextInt();
                numeromenor = (numeromenor<numero) ? numeromenor : numero;
            }
            System.out.println("El numero menor es " + numeromenor);
            if(numeromenor<10){
                System.out.println("EL numero menor es menor a 10");
            }
            else
                System.out.println("El numero menor es mayor o igual a 10");
        }



    }
}

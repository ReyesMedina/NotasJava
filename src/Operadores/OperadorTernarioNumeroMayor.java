package Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        //Ejemplo encontrar el numero mayor de 3 con el operador ternario

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int num3 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max= (max>num3) ? max : num3;

        System.out.println("El numero mayor es " + max);

    }
}

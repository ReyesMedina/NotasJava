package TareasProyectos;

import java.util.Scanner;

//Tarea 4
//El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int numero2= scanner.nextInt();

        int max = numero1>numero2 ? numero1:numero2;
        System.out.println("El numero mayor es " + max);

    }
}

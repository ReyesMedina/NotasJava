package TareasProyectos;

import java.util.Scanner;

//Tarea 5
/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida
la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente*/
public class SistemaEstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la medida actual: ");
        double litros = scanner.nextInt();

        if(litros==70){
            System.out.println("Estanque lleno");
        }
        else if(litros>=60 && litros <70){
            System.out.println("Estanque casi lleno");
        }
        else if (litros>=40 && litros <60){
            System.out.println("Estanque 3/4");
        }
        else if(litros>=35 && litros <40){
            System.out.println("Medio estanque");
        }
        else if(litros>=20 && litros<35){
            System.out.println("Suficiente");
        }
        else if(litros >=1 && litros <20){
            System.out.println("Insuficiente");
        }
    }
}

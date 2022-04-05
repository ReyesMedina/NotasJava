package TareasProyectos;

import java.util.Scanner;

//Tarea 3
/*
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o
amigos como argumentos de línea de comandos.
Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo
carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres
de la persona. Por ejemplo para Andres debe quedar como N.es
Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
N.es_A.ia_E.pe*/
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer nombre: ");
        String nombre1 = scanner.next();
       System.out.println("Introduzca el segundo nombre: ");
        String nombre2 = scanner.next();
        System.out.println("Introduzca el tercer nombre: ");
        String nombre3 = scanner.next();

        String nombreFormato1 = nombre1.substring(1,2).toUpperCase()+"."+
                nombre1.substring(nombre1.length()-2);


        String nombreFormato2 = nombre2.substring(1,2).toUpperCase()+"."+
                nombre2.substring(nombre2.length()-2);

        String nombreFormato3 = nombre3.substring(1,2).toUpperCase()+"."+
                nombre3.substring(nombre3.length()-2);
        System.out.println(nombreFormato1 + "_" + nombreFormato2 + "_"+nombreFormato3);

    }
}

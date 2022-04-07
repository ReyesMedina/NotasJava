package TareasProyectos;

import java.util.Scanner;

public class SistemaNotasAlumnos {
    //Tarea 8
    /*Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
     Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de
     notas 1, ademas mostrar el promedio total.
    Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
    para realizar los cálculos (contadores, sumas).
    Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de
    error finalizando el programa.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de notas\nPor favor introduzca sus 20 notas en escala 1-7");
        double nota;
        int notasMayor5 = 0;
        int notasMenor4=0;
        double notas1=0;

        double sumaMayor5=0;
        double sumaMenor4=0;
        boolean notaCero = false;

        for(int i=1;i<=20;i++) {
            System.out.println("Nota " + i + ": ");
            nota = scanner.nextDouble();
            if (nota == 0) {
                notaCero = true;
                break;
            }
            else if (nota == 1) {
                notas1++;
            }
            else if (nota >= 5) {
                notasMayor5++;
                sumaMayor5 += nota;
            } else if (nota <= 4) {
                notasMenor4++;
                sumaMenor4 += nota;
            }
        }
            if(notaCero){
                System.out.println("error saliendo del programa");
            }
            else{
                System.out.println("El promedio de las notas mayores a 5 es: " +
            (sumaMayor5/notasMayor5));

                System.out.println("El promedio de las notas menores que 4 es: " +
                        (sumaMenor4/notasMenor4));
                System.out.println("Obtuvo " + notas1 + " notas 1");
                System.out.println("Su promedio final es " + ((sumaMayor5+sumaMenor4+notas1)/(notasMayor5+notasMenor4+notas1)));


            }





    }
}

package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Como usar operador ternario
        //variable = condicion ? si es verdadero : si es falso;

        //String variable = 7==7 ? "es verdadero": "es falso";
        //System.out.println("variable = " + variable);

        //Ejemplo de promedio y estado
        String estado = "";

        double notaMatematicas = 0.0;
        double notaGeografia = 0.0;
        double notaCiencias = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la nota de matematicas en escala 2.00 - 7.00 ");
        notaMatematicas=scanner.nextDouble();
        System.out.println("Introduzca la nota de Geografia en escala 2.00 - 7.00 ");
        notaGeografia=scanner.nextDouble();
        System.out.println("Introduzca la nota de Ciencias en escala 2.00 - 7.00 ");
        notaCiencias=scanner.nextDouble();
        double promedio = (notaMatematicas+notaCiencias+notaGeografia)/3;
        estado = promedio>=5.49 ? "aprobado" : "reprobado";
        System.out.println("Su estado es = " + estado + " su promedio es " + promedio);

    }
}

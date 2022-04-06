package EstructurasControl;

import java.util.Scanner;

public class SwitchCaseEjemploNombreMes {
    public static void main(String[] args) {
        //Devolver el nombre del mes al recibir el numero del mes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero del mes del que quiere saber el nombre: ");
        int mes = scanner.nextInt();
        String nombreMes;

        switch (mes){
            case 1:
                nombreMes="Enero";
                break;

            case 2:
                nombreMes="Febrero";
                break;

            case 3:
                nombreMes="Marzo";
                break;
            case 4:
                nombreMes="Abril";
                break;
            case 5:
                nombreMes="Mayo";
                break;
            case 6:
                nombreMes="Junio";
                break;
            case 7:
                nombreMes="Julio";
                break;
            case 8:
                nombreMes="Agosto";
                break;
            case 9:
                nombreMes="Septiembre";
                break;
            case 10:
                nombreMes="Octubre";
                break;
            case 11:
                nombreMes="Noviembre";
                break;
            case 12:
                nombreMes="Diciembre";
                break;

            default:
                nombreMes="Indefinido";

        }
        System.out.println("El nombre del mes es " + nombreMes);


    }
}

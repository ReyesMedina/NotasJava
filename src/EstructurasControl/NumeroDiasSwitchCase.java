package EstructurasControl;

import java.util.Scanner;

public class NumeroDiasSwitchCase {
    //Ejemplo del numero de dias de un mes usando switch case

    public static void main(String[] args) {
        int numeroDias=0;
        int mes =2;
        int anio = 2020;

        switch (mes){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias=30;
                break;

            case 2:
                if(anio%400==0 || (anio%4==0 && anio%100!=0)){
                    numeroDias=29;
                }
                else
                {
                    numeroDias=28;
                }

        }
        System.out.println("Tiene " + numeroDias + " dias");
    }

}

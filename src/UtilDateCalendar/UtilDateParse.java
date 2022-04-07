package UtilDateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UtilDateParse {
    //Como convertir una fecha String a un objeto Date
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");//Establecer formato para verificar


        try{
            System.out.println("Introduzca la fecha yyyy-MM-dd");
            Date fecha = format.parse(scanner.next()); //Convierte String a Date
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));


        }catch(ParseException e){
            e.printStackTrace();

        }

    }
}

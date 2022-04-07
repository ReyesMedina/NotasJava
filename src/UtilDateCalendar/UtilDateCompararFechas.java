package UtilDateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UtilDateCompararFechas {
    //Como convertir una fecha String a un objeto Date
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");//Establecer formato para verificar


        try{
            System.out.println("Introduzca la fecha yyyy-MM-dd");
            Date fecha = format.parse(scanner.next()); //Convierte String a Date
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            //Podemos comparar con los metodos after,before,equals
            if(fecha.after(fecha2)){
                System.out.println("La fecha del usuario es despues");
            }
            else if(fecha.before(fecha2)){
                System.out.println("La fecha del usuario es antes");
            }
            else if(fecha.equals(fecha2)){
                System.out.println("Las fechas son iguales");
            }

            //tambien podemos comparar con metodo compareTo()
            if(fecha.compareTo(fecha2)>0){
                System.out.println("La fecha del usuario es despues");
            }
            else if(fecha.compareTo(fecha2)<0){
                System.out.println("La fecha del usuario es antes");

            }
            else if(fecha.compareTo(fecha2)==-0){
                System.out.println("Las fechas son iguales");
            }


        }catch(ParseException e){
            e.printStackTrace();

        }

    }
}

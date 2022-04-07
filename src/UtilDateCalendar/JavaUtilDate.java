package UtilDateCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        //Como usar la clase Date

        Date fecha = new Date(); //Instanciar objeto de la clase date con la fecha actual
        System.out.println("fecha = " + fecha);//Imprime la fecha actual

        //La clase SimpleDateFormat establece un patron para mostrar la fecha
        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        //Aqui podemos ver los formatos de fechas
        //https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/text/SimpleDateFormat.html

        //el metodo format devuelve la fecha seleccionada en el formato establecido como String
        String strFecha = df.format(fecha);
        System.out.println("strFecha = " + strFecha);

        //ejemplo de como usar metodo getTime();
        long suma=0;
        for(int i=0; i<10000000;i++){
            suma+=i;
        }
        System.out.println("suma = " + suma);
        Date fecha2 = new Date();
        //El metodo getTime retorna el total de milisegunos transcurridos desde enero de 1970 a la fecha actual

        System.out.println("Tiempo de ejecucion: "+(fecha2.getTime()-fecha.getTime()));
    }
}

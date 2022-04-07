package UtilDateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilCalendar {
    //Como usar util calendar para establecer fechas
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();//Intanciar clase
        calendario.set(2020,04,13,20,20,20); //Establecer una nueva fecha al calendario

        Date fecha = calendario.getTime(); //Obtener fecha de calendario, sino la hemos establecido regresa la fecha actual
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd 'hora ' HH:mm:ss"); //Establecer formato de fecha
        String strFecha = formato.format(fecha);//Dar formato a la fecha
        System.out.println("strFecha = " + strFecha);

    }
}

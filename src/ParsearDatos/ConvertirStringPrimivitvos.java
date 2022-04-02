package ParsearDatos;

import java.util.Locale;

//Veremos como convertir cadenas a datos primitivos como float,double,int,long,boolean
public class ConvertirStringPrimivitvos {
    public static void main(String[] args) {

        //String a Int
        String variableStr = "123";
        //Usamos en el envolvente Integer
        int variableInt = Integer.parseInt(variableStr);
        System.out.println("variableInt = " + variableInt);

        //String a float
        variableStr = "123.4f";
        //Usamos en el envolvente Float
        float variableFloat = Float.parseFloat(variableStr);
        System.out.println("variableFloat = " + variableFloat);
        System.out.println("variableFloat = " + variableFloat);
        //String a double
       variableStr="123.3232";
       //Usamos el envolvente Double
        double variableDouble = Double.parseDouble(variableStr);
        System.out.println("variableDouble = " + variableDouble);
        //String a Boolean
        variableStr="true";
        //Usamos el envolvente Boolean
        boolean variableBoolean = Boolean.parseBoolean(variableStr);
        //Es importante mencionar que ignora minusculas o mayusculas, podemos escribir TrUe y funcionara
        System.out.println("variableBoolean = " + variableBoolean);
        //String a long
        variableStr = "131231232";
        //Usamos el envolvente Long
        long variableLong = Long.parseLong(variableStr);
        System.out.println("variableLong = " + variableLong);

        //Y recordar que podemos usar var para asigarlo automaticamente dependiendo del valor de la literal
    }
}

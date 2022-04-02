package ParsearDatos;

//Veremos como convertir datos entre primitivos
public class ConversionEntrePrimitivos {

    public static void main(String[] args) {
        //Explicito
        //Se necesita especficar el parseo y en ocasiones puede haber perdidas de informacion
        //ya que estamos guardando un valor grande en una caja pequenia

        //Ejemplo int a byte

        int variableInt= 9433;
        byte variableByte = (byte)variableInt; //Casting
        System.out.println("variableByte = " + variableByte); //En este caso hay perdida de informacion




        //Implicito
        //De esta manera lo hace automaticamente ya que en esta caso queremos guardar un valor pequenio
        // en una caja grande
        //Short a Long
        short varibleShort = 23;
        long variableLong = varibleShort;
        System.out.println("variableLong = " + variableLong);
    }
    

}

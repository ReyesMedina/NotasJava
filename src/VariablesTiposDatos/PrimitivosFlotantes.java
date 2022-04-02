package VariablesTiposDatos;

public class PrimitivosFlotantes {


    public static void main(String[] args) {

        //Reales de precicion simple float
        //De manera automica hace la conversion a float por lo que el valor es 1.0
        float realFloat = 1;
        System.out.println("realFloat = " + realFloat);
        //Cuando escribimos el punto decimal por defecto se establece como double por lo que necesitamos indicar
        //con la literal f que trabajaremos con precision simple
        float realFloat2=1.5f;
        System.out.println("Datos de precision simple float");
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("Bytes: " + Float.BYTES);
        System.out.println("Bits: " + Float.SIZE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un flaot: " + Float.MIN_VALUE);

        System.out.println("Datos de precision doble double");
        double realDouble = 1.3;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Bytes: " + Double.BYTES);
        System.out.println("Bits: " + Double.SIZE);
        System.out.println("Valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: " + Double.MIN_VALUE);

        //Podemos trabajar con notacion cientifica

        float realNotacionCientifica = 1.21e3f;
        System.out.println("realNotacionCientifica = " + realNotacionCientifica);
        float realNotacionCientifica2 = 1210e-3f;
        System.out.println("realNotacionCientifica2 = " + realNotacionCientifica2);

        //En este caso con la palabra reservada var, el sistema elige el tipo de datos dependiendo el valor asignado
        //Variable dinamica
        var variableFlexible=1292;
        //Para el caso de los numericos enteros de manera automatica se asignara int como el tipo de dato mientras
        // no pase del limite  2147483647

        var variableFlexible2 = 1.34;
        //Para el caso de los decimales de manera automatica se asigna como double


    }
}

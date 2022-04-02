package VariablesTiposDatos;

public class PrimitivosBoolean {
    public static void main(String[] args) {

        //Los datos de tipo boolean son mayormente utilizados en los flujos de control o para comprobar datos
        //Declaracion
        boolean valorLogico = true; //Solo admite dos valores true o false
        System.out.println("valorLogico = " + valorLogico);


        double d = 123.23e-2;
        float f = 123.23e2f;
        valorLogico = d<f; //Expresion booleana con operadores relacionales
        System.out.println("Es " + d + " Menor que " + f + "? " + valorLogico);
    }
}

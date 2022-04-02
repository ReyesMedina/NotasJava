//PedroRMe
//Ejemplos tipos de datos y variables
// 31-03-2022

package VariablesTiposDatos;

public class PrimitivosEnteros {
    public static void main(String[] args) {

        //Variables de datos primitivos numericos

        //entre -128 a 127
        byte variableByte=12;
        System.out.println("variableByte = " + variableByte);
        System.out.println("Bytes: " + Byte.BYTES);
        System.out.println("Bits: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);
        //entre -32768 a 32767
        short variableShort=123;
        System.out.println("variableShort= " + variableShort);
        System.out.println("Bytes: " + Short.BYTES);
        System.out.println("Bits: " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Short.MIN_VALUE);
        //entre -2147483648 a 2147483647
        int variableEntero = 14;
        System.out.println("variableEntero = " + variableEntero);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Bits: " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);
        // entre -9223372036854775808 a 9223372036854775808=7
        long variableLong=12323131l;
        System.out.println("variableLong = " + variableLong);
        System.out.println("Bytes: " + Long.BYTES);
        System.out.println("Bits: " + Long.SIZE);
        System.out.println("Valor maximo de un Long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long: " + Long.MIN_VALUE);





    }
}

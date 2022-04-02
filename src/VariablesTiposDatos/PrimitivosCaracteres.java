package VariablesTiposDatos;

public class PrimitivosCaracteres {


    public static void main(String[] args) {
        //Basados en el estandar de codificacion UNICODE
        //Declaracion con char y comillas simples

        char caracter = 'A';
        System.out.println("caracter = " + caracter);

        //Declaracion con codigo UNICODE
        char caracter2 = '\u0040';
        System.out.println("caracter2 = " + caracter2);
        
        //Declaracion con codigo decimal
        char caracter3 = 64;
        System.out.println("caracter3 = " + caracter3);
        
        //Declaracion de forma directa
        char caracter4 = '@';
        System.out.println("caracter = " + caracter4);

        System.out.println("Bytes: " + Character.BYTES);
        System.out.println("Bits: " + Character.SIZE);
        System.out.println("Valor maximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un double: " + Character.MIN_VALUE);

        //Algunos caracteres especiales y de utilidad

        //Espacio
        char espacio = '\u0020';
        //Retroceso o eliminar
        char retroceso = '\b';
        //Tabulador
        char tabulador = '\t';
        //Salto de linea
        char saltoLinea = '\n';


    }

}

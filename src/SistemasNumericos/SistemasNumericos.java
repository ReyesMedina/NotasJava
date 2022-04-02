
package SistemasNumericos;

public class SistemasNumericos {
    public static void main(String[] args) {
        //Como utilizar los sistemas numericos binario,octal y hexadecimal en Java
        //Java puede recibir datos en cualquier sistema numerico pero al imprimirlos los interpreta como
        //numeros decimales.

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
       //Convertir Decimal a Binario
        System.out.println("El Numero " +numeroDecimal +" en binario es: " +Integer.toBinaryString(numeroDecimal));

        //Declarar un numero binario
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario 111110100 en decimal es igual a: " + numeroBinario);

        //Convertir a octal
        System.out.println("El Numero " +numeroDecimal +" en octal es: " +Integer.toOctalString(numeroDecimal));

        //Declarar un numero octal
        int numeroOctal = 0764;
        System.out.println("numeroOctal 0764 en decimal es igual a: " + numeroOctal);

        //Convertir a hexadecimal
        System.out.println("El Numero " +numeroDecimal +" en hexadecimal es: " +Integer.toHexString(numeroDecimal));

        //Declarar un numero hexadecimal
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal 1f4 en decimal es igual a: " + numeroHexadecimal);




    }
}

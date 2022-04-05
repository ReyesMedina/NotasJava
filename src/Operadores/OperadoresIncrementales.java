package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i =1;

        //Pre incremento
        int j = ++i; // i=i+1; primero se incrementa 1 a i y despues se le asigna a j: i=2 j=2
        //Post incremento
        int k = i++; // i=i+1; primero se le asigna i a k y despues se incrementa i : i=2 k=1

        //Nota: lo mismo sucederia en caso de un decremento --i o i--

        //Pre decremento
        j = --i; // i=i+1; primero se decrementa 1 a i y despues se le asigna a j: i=0 j=0
        //Post decremento
        k = i--; // i=i+1; primero se le asigna i a k y despues se decrementa i : i=0 k=1


    }
}

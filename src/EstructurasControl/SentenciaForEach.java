package EstructurasControl;

public class SentenciaForEach {
    //Como usar foreach
    //unicamente es utilizado para recorrer arreglos u objetos de coleccion

    public static void main(String[] args) {
        int [] numerosArreglo = {1,2,3,4,5,6,7,8,9,10};

        for(int num : numerosArreglo){//por cada elemento int : en el arreglo
            System.out.println("num = " + num);
        }

        String [] nombres = {"andres","pepe","gloria","lorena","ximena","alondra"};
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}

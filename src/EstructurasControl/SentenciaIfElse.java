package EstructurasControl;

public class SentenciaIfElse {
    public static void main(String[] args) {
        //Uso de sentencia if-else

        float promedio =2.8f;
        if (promedio>=6.5){ //Condicion a evaluar
            System.out.println("Felicidades, excelente promedio"); //Si la condicion se cumple

        }
        //Podemos evaluar mas condiciones estableciendo un else if
        else if(promedio>=5.5){
            System.out.println("Felicidades buen promedio");
        }
        else{ //Si la condicion no se cumple
            System.out.println("Necesitas esforzarte mas");
        }
    }
    //Nota: en los bloques if o else si solo tenemos una linea a ejecutar podemos evitar las llaves
    //{} en caso de tener mas de una linea es obligatorio encerrar el bloque entre llaves {}
}

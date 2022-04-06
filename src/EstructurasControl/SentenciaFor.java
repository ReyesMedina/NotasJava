package EstructurasControl;

public class SentenciaFor {
    //Como usar la sentencia for
    public static void main(String[] args) {
        for(int i = 0; i<=5 ; i++){ //Sentencia for varible de contro ; condicion ; incremento
            System.out.println("i = " + i);
        }
        //Podemos usar la instruccion continue para omitir una iteracion cuando se cumple una condicion
        for(int i = 0; i<=10 ; i++){
            //Ejemplo Imprimir solo numeros impares
            if(i%2==0){
                continue;
            }

            System.out.println("i = " + i);
            
        }
        
        //Podemos usar la intruccion break para salir del ciclo cuando se cumple alguna condicion
        for(int i = 0 ; i<10; i++){
            //Ejemplo imprimir los numeros antes del cinco
            if(i==5){
                break;
            }
            System.out.println("i = " + i);
            
        }
    }
}

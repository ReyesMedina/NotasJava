package EstructurasControl;

public class SentenciasBucleEtiquetas {
    //Como asignar etiquetas a los bucles ejemplos
    //Nos ayuda a hace referencias a ciclos anidados

    public static void main(String[] args) {

        bucle1://Etiqueta asignada al bucle debajo
        for(int i = 0; i<5;i++){
            for(int j=0; j<5; j++){
                if(i==2){
                    continue bucle1;//referencia al bucle principal

                }
                System.out.println("i= "+ i + " j = " + j);
            }
        }
    }
}

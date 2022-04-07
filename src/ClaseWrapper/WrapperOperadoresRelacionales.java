package ClaseWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1; //2 variables que apuntan al mismo objeto

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto ? " +(num1==num2));

        //Ahora
        num2=1000;//Se crea una nueva instancia
        //Ahora contienen el mismo valor pero no son el mismo objeto
        System.out.println("Son el mismo objeto ? " +(num1==num2));

        //Cuando trabajamos con tipos wrapper == compara por referencia y no por el valor a diferencia de los primitivos

        //Para comparar wrapper numericos por el valor
        // usamos el metodo equals()
        System.out.println("tienen el mismo valor? " +(num1.equals(num2)));

        //Si lo convertimos a primitivos tambien ya podriamos comparar con ==
        System.out.println("tienen el mismo valor ? " +(num1.intValue()==num2.intValue()));

        //Nota importante: excepcion en java
        //Cuando comparamos numeros menores a 127 con == siempre hara la comparacion por valor y no por referencia

        Integer numMenor1 = 127; //comprobar con 128
        Integer numMenor2= 127;
        System.out.println("Tienen el mismo valor = " + (numMenor2==numMenor1));


        //autounbuxing es referencia -> primitivo
        //autoboxing es primitivo -> referencia

        //Con cualquier otro operador relacional trabaja completamente normal
        //ya que de manera automatica hace el autounboxing


        //Sucede lo mismo con cualquier wrapper numerico cono Double, Float etc

    }
}

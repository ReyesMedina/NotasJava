package ClaseWrapper;

public class WrapperInteger {
    //Como usar Integer
    public static void main(String[] args) {
        //Boxing
        Integer intObjeto = Integer.valueOf(32321);

        //Autoboxing
        Integer intObjeto2 = 1231321;

        // Primitivo a wrapper Integer
        int numPrimitivo =3232;
        Integer intObjeto3 = Integer.valueOf(numPrimitivo);

        // Wrapper a primitivo
        //Implicita
        int numPrimitivo2 = intObjeto3;
        //Explicita
        int numPrimitivo3 = intObjeto3.intValue();

        //String a Integer

        String precio = "32323";
        Integer valorPrecio = Integer.valueOf(precio);

        //Es posible realizarlo con los demas tipos






    }
}

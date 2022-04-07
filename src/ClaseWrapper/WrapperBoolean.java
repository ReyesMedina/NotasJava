package ClaseWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Boolean objBoolean1 = Boolean.valueOf(true);
        Boolean objBoolean2 = Boolean.valueOf("true");
        boolean primBoolean1 = true;

        System.out.println("Tienen el mismo valor? " + (objBoolean1==objBoolean2));
        System.out.println("Tienen el mismo valor? " + (objBoolean1==primBoolean1));

        //A diferencia de los numericos en los wrapper boolean podemos comparar por valor con ==
        //ya que en este caso no se compara por instancia

    }
}

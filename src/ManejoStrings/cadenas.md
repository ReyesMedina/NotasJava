#String
Los string son objetos de java, de tipo referencia
~~~
String cadena = new String("Java");
~~~
Aunque tambien los string se pueden representar con
una sintaxis especialmente comoda
~~~
String cadena = "Java";
~~~

-Los carateres de un string se codifican usando UNICODE  
-Son inmutables  
##Concatenacion
-Sobre las cadenas se define la operacion concatenar
con el operador '+'  

~~~
String nombre="Pedro';
String apellido= "Reyes";
String nombreCompleto = "nombre+ " " +apellido";

~~~

##Comparacion
Con el operador relacional de igualda == compara por referencia  
Con el metodo equals() compara por valor  
Ejemplo:  
~~~
String str = "Hola";
String str2 = new String("Hola");

//Chequea si son el mismo objeto
System.out.println("Son el mismo objeto? " + (str== str2));

//Chequea si tiene el mismo valor
System.out.println("Son el mismo objeto? " + str.equals(str2));

~~~

##Metodos de la clase
![](C:\Users\107114781\Documents\JAVA\NotasJava\Imagenes\metodosString.PNG)
![](C:\Users\107114781\Documents\JAVA\NotasJava\Imagenes\metodosString2.PNG)
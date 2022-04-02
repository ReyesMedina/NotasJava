###Que es una variable
-Espacio de memoria  
-Son lo mas importante de un lenguaje de programacion, son las entidades, contienen valores o datos.  
-El tipo de variable determina los valores que la variable puede contener y las operaciones que se pueden realizar con ella.  
###Nombres de variables
-Empiezan con letra minuscula  
-Juego de caracteres en la codificacion unicode  
-No se permiten palabra reservadas  
-No se permiten caracteres especiales  
-No deben tener el mismo nombre que otras variables
cuyas declaraciones aparezcan en el mismo ambito.  

###Alcance de una variable
Variables de clase:  
-Pueden usarse en cualquier metodo de la clase  
-Se inicializan con valores por default.  
-Variables locales:  
-Se pueden usar solo en el metodo que se definen  
-Se deben inicializar

![](C:\Users\107114781\Documents\JAVA\Guia_JAVA\Imagenes\AlcanceDeUnaVariable.png)

###Tipos de datos


![](C:\Users\107114781\Documents\JAVA\Guia_JAVA\Imagenes\TiposDatosJava1.png)
 Existen dos tipos de datos en Java:  
Primitivos:  
Los tipos primitivos contienen un solo valor e incluyen los tipos como los enteros, flotantes, caracteres y booleanos.  
Ejemplos:  
~~~
Int numero;
float numero;
~~~
Referenciados:  
Los tipos de datos referencia, indican que vamos a trabajar con instancias de clases, no con tipos primitivos. De esta manera,
una variable de tipo referencia establece una conexión hacia un objeto, y a través de esta conexión podemos acceder a sus métodos y atributos.  

~~~
String nombre = "Pedro";
Usuario usuario = new Usuario ("Pedro");
~~~
Boolean:  
Un boolean expresa un valor de verdad, puede ser verdadero o falso  
Char:  
Usa el codigo unicode y ocupa cada caracter 16 bits  
Enteros:  
Son 4 tipos byte, short, int y long, difieren en las precisiones y pueden ser positivos o negativos  
Numeros reales:  
Es un tipo de dato para guardar numeros reales en coma flotante con precision simplre y doble  
![](C:\Users\107114781\Documents\JAVA\Guia_JAVA\Imagenes\resumendatos.PNG)


![](C:\Users\107114781\Documents\JAVA\Guia_JAVA\Imagenes\WrapperPrimitivos.jpg)

###Casting de datos
Los castin en programacion se utilizan para asegurarse
que un dato es de un tipo en concreto.  
Si es necesario, se convertira al tipo de dato pedido,
pero no sirve en todos los casos ya que no es un sistema
de conversion como tal.  
El casting es un procedimiento para transformar una variable
primitiva de un tipo a otro. Tambien se utilizan para
transformar un objeto de una clase a otra clase
siempre y cuando haya una relacion de herencia entre ambos.  
Casting implicito:  
-Cuando se coloca un valor pequenio en un contenedor grande
~~~
int num1;
long num2 = num1;
~~~
-Explicito:  
-Valor grande en un contenedor pequenio, son susceptibles a perdida de datos
~~~
int num1=23121;
short num2= short(num1);
~~~

![](C:\Users\107114781\Documents\JAVA\Guia_JAVA\Imagenes\CastingJava3.png)

Donde:
no: indica que no hay posibilidad de conversión.  
si: indica que el casting es implícito.  
si*: indica que el casting es implícito pero se puede producir pérdida de precisión.  
cast: indica que hay que hacer casting explícito.

Referencia: https://sites.google.com/site/pro012iessanandres/java/conversion-entre-tipos-primitivos-casting


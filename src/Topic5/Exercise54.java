package Topic5;
/*
Ejercicio 5.4. Declara dos cadenas equals, una en mayúsculas y otra en minúsculas.
Intenta utilizar equalsIgnoreCase() y equals() para saber si ambas cadenas son iguales o no.

Ahora declara las siguientes variables:

String string1= "ELI";

String string2= new String("ELI");

¿Puedes probar a comparar con "=="? ¿Funciona de la misma manera que equals()? ¿Por qué? Trae tus respuestas al diario :)

 */

public class Exercise54 {
    public static void main(String[] args){

        String cadena = "hola mundo";
        String cadena2 = "HOLA MUNDO";

        if (cadena.equalsIgnoreCase(cadena2)){
            System.out.println(true);
        }else
            System.out.println(false);

        String string1 = "ELI";
        String string2 = new String("ELI");

        if (string1 == string2){
            System.out.println(true);
        }else
            System.out.println(false);
    }
}

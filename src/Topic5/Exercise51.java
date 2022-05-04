package Topic5;

/*
Ejercicio 5.1.  Intenta hacer el ejercicio del Curso de Java: Capítulo 7a,
pero en lugar de generar tickets, intenta generar cadenas aleatorias de 5 de longitud.
Cuando vayas a imprimir las cadenas, cámbialas a mayúsculas.

 */

public class Exercise51 {
   static String getRandomString(int i) {
      String theAlphaNumericS;
      StringBuilder builder;

      theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnñopqrstuvwxyz"
              + "0123456789";

      //create the StringBuffer
      builder = new StringBuilder(i);

      for (int m = 0; m < i; m++) {
         // generate numeric
         int myindex = (int)(theAlphaNumericS.length()
                 * Math.random());
         // add the characters
         builder.append(theAlphaNumericS
                 .charAt(myindex));
      }
      return builder.toString();
   }

   public static void main(String[] args) {
      // the random string length
      int i = 5;

      // output
      System.out.println("A random string: " +  getRandomString(i).toUpperCase());
   }
}

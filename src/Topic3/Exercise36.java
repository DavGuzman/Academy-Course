package Topic3;

import java.util.Scanner;

public class Exercise36 {
    public static void main (String[] args){

        /*
        Ejercicio 3.6. El sistema debe pedir que se rellenen los números hasta que el usuario escriba el número cero.
        Después el sistema imprimirá la suma de todos los números.
        */
        
            Scanner s = new Scanner(System.in);
            int value = -1;
            int sum = 0;

            while(value != 0) {
                System.out.print("Type a value: ");
                value = s.nextInt();
                sum = sum + value;

            }

            System.out.println(sum);
        }
}

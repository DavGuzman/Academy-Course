package Topic3;

import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args){

        /*
        Ejercicio 3.3. Crea un programa que lea un tipo de animal.
        El programa debe imprimir "este no es el animal correcto" hasta que el usuario escriba el correcto ("koala").
         */

        System.out.println("Enter a one animal: ");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();

        while (!(animal.equals("koala") )){
            System.out.println("This is not a correct animal. Try again: ");
            animal = scanner.next();
        }
    }
}

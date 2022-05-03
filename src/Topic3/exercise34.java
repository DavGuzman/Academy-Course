package Topic3;

import java.util.Scanner;

public class exercise34 {

    public static void main(String[] args){

        /*
        Ejercicio 3.4.  Crea un programa que lea la edad y la imprima:

        - Si no tienes más de 18 años, imprime "Eres demasiado joven" (Usa el símbolo "!")

        - Si tu edad es de 18 o más y menor o igual a 35, imprime "Joven"

        - Si tiene más o igual que 36, o su edad es menor o igual que 60, imprima "es usted una persona de mediana edad"

        - Para otras situaciones, imprima "eres demasiado mayor"
         */

        //first declare age.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int edad = scanner.nextInt();

        while (true){
            if (edad<18){
                System.out.println("You are too young. ");
            } else if (!(edad<=18 && edad >=35)) {
                System.out.println("Younger");
            } else if (edad>=36 && edad<=60) {
                System.out.println("You are a middle age person");
            }else {
                System.out.println("You are too old");
            }
        break;
        }
    }
}

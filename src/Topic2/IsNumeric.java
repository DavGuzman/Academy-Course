package Topic2;

import java.util.Scanner;

public class IsNumeric {
    private static char String;

    public static void main(String[] args){

        /*
        Ejercicio 2.5. Escriba un programa que lea un solo carácter en el teclado y,
        mediante la instrucción switch, imprima en la pantalla si es un número o no.
        NOTA: Utiliza los métodos next (Scanner) para leer un String del teclado y charAt (String)
        para obtener el primer carácter del String. Ayuda extra: Busca en google cómo funciona el método "isNumeric()".
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a one character: ");
        char y = scanner.next().charAt(0);

        String number = "no";
        if(Character.isDigit(y))
            number = "yes";

        switch(number) {
            case "yes":
                System.out.println("The character is a number!");
                break;
            case "no":
                System.out.println("The character is NOT a number.");
                break;
            default:
                System.out.println("System error!");
        }
    }
}

package Topic4;
/*
Ejercicio 4.3. Escribe un programa que lea un valor entero en el teclado e imprima
un cuadrado de asterisco de este tamaño. Por ejemplo, si el número es 4, el programa debe imprimir **** **** **** ****
*/

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] main){

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i<number; i++){
            for (int j = 0; j<number; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

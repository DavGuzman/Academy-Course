package Topic4;

/*
Ejercicio 4.1. Intenta hacer el ejercicio del Curso de Java: Capítulo 4d,
pero en lugar de leer el número de alumnos y el test, debe leer el número de coches en un atasco,
y pensando que cada coche tiene 2 personas, rellene la edad de las personas. Finalmente imprime la media de personas.
*/

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args){

        // First what we know.
        int age = 0;
        int totalAge = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cars have? ");
        int cars = scanner.nextInt();


        for (int i = 0; i<cars; i++){
            int totalPerson = cars*2;
            for (int j=0 ; j<totalPerson; j++){
                System.out.println("Enter you age " + (j+1));
                age = scanner.nextInt();
                totalAge += age;
            }
            double average = totalAge/totalPerson;
            System.out.println(average);
            break;
        }









    }
}

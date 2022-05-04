package Topic4;
/*
Ejercicio 4.2.  Intenta hacer el ejercicio del Curso de Java: capítulo 5a pero añade otros dos métodos.
El primero debería imprimir la edad de la persona, y el segundo si es o no un zombi.
 */

import java.util.Scanner;

public class Exercise42 {
    public  static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //age
        System.out.println("How old are you? " + name);
        int age = scanner.nextInt();
        //zombie
        System.out.println("You are a zombie? " + name);
        boolean zombie = scanner.hasNextBoolean();

        //Llamar al method
        greetUser(name);
        personAge(name);
        zombieYouAre(name);

    }
    public static void greetUser(String  name){
        System.out.println("Hi there, " + name);
    }

    public static void personAge(String age){
        System.out.println("You are " + age + " years old");

    }
    public static boolean zombieYouAre(String zombie){
        if (zombie.equals("yes")){
            System.out.println("You are a zomnbie ");
            return true;
        }else{
            System.out.println("You aren't a zombie");
            return false;
        }
    }
}



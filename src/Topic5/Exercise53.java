package Topic5;
/*
Ejercicio 5.3. Escriba un programa que inicialice 5 cadenas en un ArrayList.
Añade otro elemento, elimina el primero, imprime el tamaño del arraylist,
imprime el elemento en el índice 3, y utiliza la clase Iterator
para imprimir todos los elementos del arraylist. Finalmente,
comprueba todos los elementos del arraylist y encuentra los elementos que contienen la letra "e".
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Exercise53 {
    public static void main(String[] args){

        ArrayList<String> firstArray = new ArrayList<>();
        firstArray.add("Cat");
        firstArray.add("Dog");
        firstArray.add("Duck");
        firstArray.add("Bear");
        firstArray.add("Polar Bear");
        System.out.println("Arraylist" + firstArray);
        // Add other element

        firstArray.add("Bird");
        System.out.println("Arraylist" + firstArray);
        // Get the element from arraylist
        String element = firstArray.get(1);
        System.out.println("Element at index 1: " + element);

        //Change the element of arraylist
        firstArray.set(2, "Bat");
        System.out.println("Modified ArrayList " + firstArray);

        // Remove an element
        String remove = firstArray.remove(0);
        System.out.println("Updated Arraylist: " + firstArray);
        System.out.println("Removed element " + remove);

        // Print element on index 3
        System.out.println("The third element is " + firstArray.get(3));

        // length of ArrayList
        System.out.println("The lenght of arraylis is: " + firstArray.size());

        // Iterate using for-each loop
        System.out.println("Access to the individual element: ");

        for (String animal : firstArray){
            System.out.print(animal);
            System.out.print(" , ");
        }
        // Method iterator
        Iterator it = firstArray.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // Letter "E"
        System.out.println(firstArray.stream().filter(s -> s.contains("e")).collect(Collectors.toList()));
    }
}

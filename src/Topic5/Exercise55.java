package Topic5;
/*
Ejercicio 5.5. Escribe un programa que inicialice 5 cadenas en un ArrayList.
Desde la clase String, utiliza el método replace para sustituir la letra "e" por la "x".
Ahora incluye algunos espacios antes de cada uno de los elementos del arrrayList con concat(),
imprímelo y utiliza el método trim() para eliminar los espacios.
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise55 {
    public static void main(String[] args) {

        ArrayList<String> firstArray = new ArrayList<String>();
        firstArray.add("Cat");
        firstArray.add("Dog");
        firstArray.add("Duck");
        firstArray.add("Bear");
        firstArray.add("Polar Bear");


        for (int i = 0; i < firstArray.size(); i++) {
            String array1 = firstArray.get(i);
            array1 = " ".concat(array1);
            //System.out.println(array1);
            firstArray.set(i, array1);
        }
        System.out.println(firstArray);
        for (int b = 0; b < firstArray.size(); b++) {
            String arr2 = firstArray.get(b);
            firstArray.set(b, arr2.trim());
        }
        System.out.println(firstArray);


        String stringArrayLista = firstArray.stream().map(Objects::toString).collect(Collectors.joining());
        //System.out.println(stringArrayLista.replace('e', 'x'));

    }

}

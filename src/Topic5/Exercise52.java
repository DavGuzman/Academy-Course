package Topic5;

/*
Ejercicio 5.2. Escribe un programa que lea una frase (al menos 4 palabras),
divida la cadena por espacios y almacene cada trozo de cadena en un Array.
Después imprime el tercer elemento, cambia el segundo elemento a 0, imprime todos los elementos y lo ordena.
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Exercise52 {
    public static void main(String[] args) {
        countWords("I love test Automation");
    }
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your sentence contains %d words: ",numberOfWords);
        System.out.println(message);
        for(int i=0; i<numberOfWords;i++) {
            System.out.println(words[i]);
        }
        System.out.println("\n"+"The third element of the sentence is: "+ words[2]);
        String[] arrOfStr = text.split(" ");
        ArrayList<String> sentence = new ArrayList<String>(Arrays.asList(arrOfStr));
        sentence.set(1, "0");
        System.out.println(sentence);
    }
}
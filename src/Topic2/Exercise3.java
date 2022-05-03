package Topic2;

public class Exercise3 {
    public static void main(String[] args) {

        String var1 = "Hello world";
        String var2 = "Hello world";
        String var3 = "HELLO WORLD";

        if (var1.equals(var2)){
            System.out.println("The strings are the same");
        }
        else if (var1.equalsIgnoreCase(var3)) {
            System.out.println("The strings have the same length");
        }
        else {
            System.out.println(var1 == var2);
        }



    }
    }

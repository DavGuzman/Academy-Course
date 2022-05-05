package Topic4;

/*
Ejercicio 4.4. Tienes que diseñar el código del acceso de una cuenta.
El usuario puede intentar el acceso 3 veces, si el pin no es correcto 3 veces,
la cuenta será bloqueada.
* El pin debe ser un número de 4 dígitos.
* Las acciones del sistema deben ser:
- Verificar si es sólo un número (sin letras)

- Verificar si es sólo un número de 4 dígitos (no 3 o 1, debe ser 4)

- Si el código pin no encaja, el usuario debe rellenar una y otra vez (infinitas veces) hasta que el código pin cumpla las reglas.

- Si el código pin es correcto, el sistema permite el acceso a la cuenta.

- Si el código pin es incorrecto, el usuario tiene otros 2 intentos.
 Si después de los 3 intentos el usuario no rellena el código pin correcto, la cuenta será bloqueada.

Paso 1: Primero intente crear el código para llenar el código pin.  Utilice "String pincode = scanner.next();".

Paso 2: Luego intenta incluir el límite de 3 intentos.

Paso 3: Cuando funcione intenta incluir la regla de los 4 elementos

Paso 4: Al final incluya la regla de que no puede ser diferente de un número.
*/

import java.util.Scanner;

public class Exercise44 {
    public static boolean isNumber(String text) {
        boolean number = true;
        if(text.length() == 0)
            number = false;
        // Compara si es digito o letra, digito a digito.
        for(int i = 0; i < text.length(); i++)
            if(!Character.isDigit(text.charAt(i)))
                number = false;
        return number;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pincode;
        String mypin = "1221";

        int i;
        for (i = 0; i < 4; i++) {
            System.out.println("Enter your pin: ");
            pincode = scanner.next();
            if (!isNumber(pincode)){
                System.out.println("Incorrect format, introduce 4 numbers.");
            }
            while (!isNumber(pincode) || pincode.length() != 4) {
                System.out.println("Error, try again.");
                pincode = scanner.next();
            }
            if (pincode.equals(mypin)) {
                System.out.println("Congrats, enter the system...");
                break;
            } else if (i == 1) {
                System.out.println("Error. Your account is blocked");
                break;
            }else {
                System.out.println("Error, try again");
            }
        }
    }
}

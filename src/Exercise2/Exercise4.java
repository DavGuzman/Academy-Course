package Exercise2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter another number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter one last number: ");
        double thirdNumber = scanner.nextDouble();

        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println(firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println(secondNumber);
<<<<<<< HEAD
        } else if (thirdNumber>secondNumber && thirdNumber>firstNumber) {
            System.out.println(thirdNumber);
        }else {
            System.out.println("The numbers entered are equals.");

=======
        }else {
            System.out.println(thirdNumber);
>>>>>>> e5bfb504fe8aa4deb2e24a1edd72845488a899a7
        }

    }
    }

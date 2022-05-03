package Topic2;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){
        //Ticket info
        int ticket = 7;
        double childDiscount = 0.40;
        double seniorDiscount = 0.45;
        //Age info
      System.out.println("Please enter your age:");
        Scanner scanner= new Scanner(System.in);
        int age = scanner.nextInt();

       //Determine ticket price
        double price;

        if(age<5){
            price = (ticket*childDiscount);
            System.out.println("The cost of the children ticket is: " + price + "€");
        }
        else if (age<60){
            price = ticket;
            System.out.println("The cost of the ticket is: " + price + "€");
        }
        else{
            price = (ticket*seniorDiscount);
            System.out.println("The cost of the Senior ticket is: " + price + "€");
        }

    }





}

import java.util.*;
public class SwapProgram{

    public static void main(String[] args){

        Scanner swap = new Scanner(System.in);

        //Declare the variables for the program
        int num1,num2,num3;

        //Takes the first number for swapping from the user
        System.out.print("Please enter the first number that you want to swap with the second number: ");
        num1 = swap.nextInt();

        //Takes the second number for swapping from the user
        System.out.print("Please enter the first number that you want to swap with the second number: ");
        num2 = swap.nextInt();

        // The logic of Swapping value
        num3 = num1;
        num1 = num2;
        num2 = num3;

        //Printing the value after swapping
        System.out.println("Your value is here after swapping:\nFirst number after swap: " + num1 + "\nSecond number after swap: " + num2 );

    }
}

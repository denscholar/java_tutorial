// package src.com.Dennis;

/* Contants: A vaariable whose valusse can not be changed
 * - To define a constant we use the 'final' keyword
 * - constants can be used like any other variable
 * - constant is written using Uppercase/snake case style
 * 
 * */
// the scanner class and what's used for
// the scanner class allows us to read input from the keyboard
// input.next()
// input.nextDouble()
// input.nextInt()
// input.nextShort()
// input.nextLong()
// input.nextBoolean() etc
import java.util.Scanner;

public class Constant {

    public static void main(String[] args) {
        // Write a program that asks the user to enter a four degit number and tell if the number is a lucky number or not.
        // A lucky number(ABCD) is if A+B = C+D
        Scanner input = new Scanner(System.in);
        

        System.out.print("give me a 4-digit number: ");

        String degitNumber = input.nextLine();

        if (degitNumber.length() != 4) {
            System.out.println("Lucky number must be 4 degit");
            input.close();
            return;
        }
        int num1 = Integer.parseInt(degitNumber.substring(0, 1));
        int num2 = Integer.parseInt(degitNumber.substring(1, 2));
        int num3 = Integer.parseInt(degitNumber.substring(2, 3));
        int num4 = Integer.parseInt(degitNumber.substring(3, 4));


        if (num1 + num2 == num3 + num4) {
            System.out.println("Congratulations, this is a lucky number");
        } else {
            System.out.println("This is not a lucky number, try again");
        }
    }
}

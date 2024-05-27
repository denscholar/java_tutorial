
import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");

        int number = input.nextInt();

        while (number < 1 || number > 10) {
            System.out.print(number + " not between 1 and 10, try again: ");
            number = input.nextInt();
        }
        System.out.println(number + " is between 1 and 10");

    }
}

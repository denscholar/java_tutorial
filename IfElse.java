
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Afripoint-BlackEnd
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input luck number: ");

        int num = input.nextInt();

        int num4 = (num % 10); // 1234 % 10 = 4
        int num3 = (num / 10) % 10; //  1234 % 10 % 10 = 3
        int num2 = (num / 100) % 10;
        int num1 = (num / 1000) % 10;

        if (num1 + num2 == num3 + num4)
            System.out.println(num + " is a lucky number");
        else
            System.out.println(num + " is not a lucky number");

    }

}

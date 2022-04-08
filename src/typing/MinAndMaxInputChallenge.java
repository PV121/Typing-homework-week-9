package typing;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    /**
     * Read the numbers from the console entered by the user and print the minimum and maximum number
     * the user has entered.
     * -Before the user enters the number, print the message Enter number:
     * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
     * Hint:
     * -Use an endless while loop.
     * -Create a class with the name MinAndMaxInputChallenge.
     */
    public static void main(String[] args) {
        double min = 0;
        double max = 0;
        boolean first = true;
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter number: ");

            if (input.hasNextDouble()) {
                double num = input.nextDouble();
                if (num > max) {//10>5
                    max = num;//max=10
                }
                if (num < min) {//10<5
                    min = num;//min=5
                }
                if (first) {//5,
                    first = false;
                    min = num;//5,10
                    max = num;//5
                }
            } else {
                System.out.println("Invalid entry");
                break;
            }
        }
        System.out.println("Minimum number:" + min);
        System.out.println("Maximum number:" + max);
    }
}

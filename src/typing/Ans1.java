package typing;

import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=1;
        int sum=0;

        while (counter<=10){
            System.out.println("Enter number: ");
            boolean num = input.hasNextInt();
            if(num){
                 sum+=input.nextInt();
                 counter++;
            } else {
                System.out.println("Invalid Entry");
            }
        }
        System.out.println("Sum of numbers is "+sum);
    }
}

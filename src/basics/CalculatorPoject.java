package basics;

import java.util.Scanner;

public class CalculatorPoject {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double num1= sc.nextDouble();
        System.out.println("Enter number 2: ");
        double num2= sc.nextDouble();
        System.out.println("Choose an option");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice =sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(" Result : "+(num1+num2));
                break;
            case 2:
                System.out.println(" Result : "+(num1-num2));
                break;
            case 3:
                System.out.println(" Result : "+(num1*num2));
                break;
            case 4:
                if(num2!=0) {
                    System.out.println(" Result : " + (num1 / num2));
                }
                else{
                    System.out.println("cannot divide by zero");
                }
                break;
                default:
                    System.out.println("Invalid choice");
        }
        sc.close();
    }

}

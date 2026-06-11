// conditional statement includes
//1.if-else , 2.if - else ladder, 3. nested if else
package basics;
import java.util.Scanner;
public class ConditionalStatements {
    static void main(BasicsString[] args) {
        //1.Simple if-else code to know if a candidate can vote or not it will help you to understand how if-else works!
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc1.nextInt();
        if (age >= 18) {
            System.out.println("Your are eligible to vote");

        } else {
            System.out.println("Your are not eligible to vote");
            //taking input from user using Scanner

        }
        // 2.if else if ladder this is an basic example of if else ladder
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter your day : ");
        int day = sc2.nextInt();
        if (day==1){
            System.out.println(" go to home");
        }
        else if(day==2) {
            System.out.println("go to village");
        }
        else{
            System.out.println("go to office");
        }

        // 3.nested if you are given three num find max num

        int a = 4;
        int b = 8;
        int c = 11;

        if (a > b) {
            System.out.println("a is greater than b");
            if(a > c){
                System.out.println("a is greater than c");
                System.out.println("a is largest"+a);
            }
            else{
                System.out.println("c is largest than a");
                System.out.println("c is largest"+c);
            }

        } else{
            System.out.println("b is greater than a");

        }if(b > c){
            System.out.println("b is greater than c");
            System.out.println("b is largest "+b);
        }
        else{
            System.out.println("c is largest than b");
            System.out.println("c is largest"+c);
        }



    }

}

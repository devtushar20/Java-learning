package basics;
import java.util.Scanner;
public class Userinput {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.next();
        System.out.println("your name is :"+name);
    }


}

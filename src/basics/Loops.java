package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //1.for loop
       for(int i=0 ; i<=5 ; i++){
            System.out.println(i);//basic loop code for understanding
            //int i=0 initializing, i<=5 condition , i++ update
        }
        //Table using loop
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc1.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n+" * "+i+" = "+i*n);
       }

        //to find sum of the numbers
        /*int sum=0;
        for(int i=1;  i<=n ; i++){
            sum+=2*i;
            System.out.println("sum is: "+sum);
        }*/

        //2.While loop
        //basic code for understanding it will execute until the condition is false
        int i =0;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        //This will help you to understand how while loop works
        Scanner sc2 = new Scanner(System.in);
        boolean haslearnt = false;
        while(!haslearnt){
            System.out.println("Went to school,tried to learn");
            System.out.println("have you understood");
            haslearnt = sc2.nextBoolean();
        }

        //3.do while loop

      /* int i=1;
        do{
            System.out.println(i);
            i++; //if you do not write this you will enter infinite loop
        }while(i<= 5);
        System.out.println("out of the loop");*/



    }
}

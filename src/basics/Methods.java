//Methods are used to achieve the reusability of the code
//Remove comments if needed
package basics;

public class Methods {
    static void main(BasicsString[] args) {

//        System.out.println(1);
//        System.out.println(2);
//        greet();
//        System.out.println(3);
//       int min = min(4,6);
//
//
//        System.out.println("min num= "+min);
        //System.out.println(averagefromfunction);

        //you can also use Math.min

        int a = 5;
        int b = 10;
        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(3,4));
        System.out.println(Math.abs(-3));
        System.out.println(Math.random());
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.9));
    }

    static void greet(){
        System.out.println("Hello World");
        System.out.println("this is how method is called");
        walk();
    }
    static void walk(){

        System.out.println("Method inside method");
    }
//    public static int average(int a, int b){
//        int avg =(a+b)/2;
//        return avg;
//    }
    // below code is a function for min num between two num
//    static int min(int a, int b){
//        return a<b?a:b;
//    }



}

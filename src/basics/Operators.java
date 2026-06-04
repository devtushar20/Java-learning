package basics;

public class Operators {

    public static void main(String[] args) {

        int a = 12;
        int b = 7;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators");
        int x = 10;
        x += 5;
        System.out.println("x += 5 : " + x);

        x -= 3;
        System.out.println("x -= 3 : " + x);

        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        System.out.println();

        // Logical Operators
        System.out.println("Logical Operators");
        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));

        System.out.println();

        // Unary Operators
        System.out.println("Unary Operators");
        int num = 5;

        System.out.println("num = " + num);
        System.out.println("++num = " + (++num));
        System.out.println("--num = " + (--num));

        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
package basics;

public class BasicsString {
    public static void main(String[] args) {
        String name = "Tushar";
        System.out.println(name);
        String newname="Rohit";
        System.out.println(newname);

        //Comparing two string in java
        //equals() it compares the original content of string
        if (name.equals(newname)){
            System.out.println(" is the same");
        }
        else{
            System.out.println(" is not the same");
        }
    }
}

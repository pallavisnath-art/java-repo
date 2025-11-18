package string;

public class StringMethod {

    public static void main(String[] args) {
        String n = "pallavi";
        String n1 = "Pallavi";
        String n2 = n1; // ❌ (your code had: n2 = n1,n; which is invalid)
        
        // 1. length()
        System.out.println(n.length()); // total number of characters

        // Convert int to String using valueOf()
        int a = 100;
        String b = String.valueOf(a); // converted int to string
        System.out.println(b);

        // equals()
        System.out.println(n.equals(n1));

        // equalsIgnoreCase()
        System.out.println(n.equalsIgnoreCase(n1));

        // isEmpty()
        System.out.println(n.isEmpty());

        // toUpperCase() and toLowerCase()
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());

        // concat()
        System.out.println(n.concat(n1));

        // contains()
        System.out.println(n.contains("all"));
    }
}
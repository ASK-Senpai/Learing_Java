import java.util.Scanner;
public class Case_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("String starts with lowercase...");
        } else if (ch >= 'A' && ch<= 'Z') {
            System.out.println("String starts with uppercase...");
        }
        else System.out.println("String starts with nither...");
    }
}

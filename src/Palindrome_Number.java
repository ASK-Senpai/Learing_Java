import java.util.Scanner;
public class Palindrome_Number {
    public static boolean is_Palindrome(int a){
    int rem = 0;
    while (a>rem){
        rem= (rem*10) + (a%10);
        a= a/10;
    }
        return a == rem || a == (rem / 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        boolean c = is_Palindrome(num);
        if (c){
            System.out.println("Number is Palindrome...");
        }
        else System.out.println("Number is not Palindrome...");
    }
}

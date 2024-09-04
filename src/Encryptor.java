import java.util.Scanner;
public class Encryptor {
    public static String encrypt(String Input){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Input.length(); i++) {
            char c = Input.charAt(i);
            result.append((char) (c + 1));
        }

        return result.toString();
    }
    public static String decrypt(String Input){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Input.length(); i++) {
            char c = Input.charAt(i);
            result.append((char) (c - 1));
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String a= in.nextLine();
        String b = "";
        System.out.println(a);
        System.out.println("Enter 0 for encrypt and 1 for decrypt");
        int check = in.nextInt();
        if (check == 0){
            b= encrypt(a);
        } else if (check == 1) {
            b= decrypt(a);
        }
        System.out.println("Result: " + b);
    }
}

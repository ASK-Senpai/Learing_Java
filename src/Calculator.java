import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Senpai, Welcome to noob calcuator...");
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println("You can press + - * / or x for exit");
            char op = in.next().trim().charAt(0);
            if (op == '+'){
                System.out.println("Enter the numbers to perform action:- ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println("Result: " + Math.add(num1,num2));
            } else if (op == '-') {
                System.out.println("Enter the numbers to perform action:- ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println("Result: " + Math.sub(num1,num2));
            } else if (op == '*') {
                System.out.println("Enter the numbers to perform action:- ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println("Result: " + Math.mul(num1,num2));
            } else if (op == '/') {
                System.out.println("Enter the numbers to perform action:- ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println("Result: " + Math.div(num1,num2));
            } else if (op == 'x'|| op == 'X') {
                System.out.println("Thanks for using this senpai...");
                break;
            }else {
                System.out.println("Please enter a valid operation...");
            }
        }
    }
}

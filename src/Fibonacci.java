import java.util.Scanner;
public class Fibonacci {
    public static long fibonacci(int index){
        long a=1L;
        long b=1L;
        if (index == 0){
            return 0;
        } else if (index == 1 || index == 2) {
            return 1;
        }
        for (int i = 2; i < index; i++){
            long temp = a;
            a = a+b;
            b= temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter index for Fibonacci value: ");
        int index = in.nextInt();
        System.out.println("Fibonacci value at index "+index+" is "+fibonacci(index));
    }
}

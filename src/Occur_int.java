import java.util.Scanner;
public class Occur_int {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = in.nextInt();
        System.out.println("Enter which number's occurrence you want to check of: ");
        int b = in.nextInt();
        int count = 0;

        while (a>0){
            int rem = a%10;
            if (rem == b){
                count++;
            }
            a = a/10;
        }
        System.out.println("The number "+b+" occurs "+count+" Times");
    }
}

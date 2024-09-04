import java.util.Scanner;
public class Sum_of_3 {
    public static int calsum(int num1,int num2,int num3){
        int sum = num1+num2+num3;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int sum = calsum(num1,num2,num3);
        System.out.println("The sum is "+sum);
    }
}

import java.util.Scanner;
public class Armstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an ArmStrong number: ");
        int num = in.nextInt();
        if (isArmstrong(num)){
            System.out.println("Number is an Armstrong number...");
        }
        else {
            System.out.println("Number is not an Armstrong number...");
        }
//        for (int i = 0;i<10000;i++){
//            if (isArmstrong(i)){
//            System.out.println((i)+" ");}
//        }
    }

    public static boolean isArmstrong(int a){
        int rem=0;
        int n = a;
        int count=Math.order(a);
        while (n > 0){
            rem += Math.pow((n%10),count);
            n/=10;
            }
        return (rem == a);
        }


}

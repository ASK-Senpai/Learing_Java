import java.util.Scanner;

public class Avg_of_3 {
    public double avg(int num1,int num2,int num3){
        int totalsum = Sum_of_3.calsum(num1,num2,num3);
        double avg = (double) totalsum/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        Avg_of_3 avgOf3 = new Avg_of_3();
        System.out.println("Avg is :- " + avgOf3.avg(num1,num2,num3));
    }
}

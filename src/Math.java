public class Math {
    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static int order(int n){
        int count=0;
        while (n > 0)
        {
            count++;
            n/=10;
        }
        return count;
    }

    public static int pow(int base, int power){
        int result=1;
        if (power == 0){
            return 1;}
        else if (power == 1){return base;}
        while (power > 0){
            if (power % 2==1){
                result*=base;
            }
            base *= base;
            power /=2;
        }
        return result;
    }

}

public class fastPow {
    public static void main(String[] args) {
        int a=5;
        int n=5;
        System.out.println(powerFun(5,5));

    }

    private static int powerFun(int a, int n) {
        if(n==0)
            return 1;
        int x= (int) Math.pow(a,n/2);
        if(n%2==0){
            return x*x;
        }
        else {
           return  x*x*a;
        }


    }
}

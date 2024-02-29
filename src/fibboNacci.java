public class fibboNacci {
    public static void main(String[] args) {
        int A=9;
        System.out.println(series(A));
    }

    private static int series(int a) {
        if(a<=1)
        return a;
        else {
            a= series(a-1)+series(a-2);
        }


        return a;
    }

}

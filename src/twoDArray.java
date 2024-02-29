public class twoDArray {
    public static int arrray(int[] C, int B , int A) {
        int ans = C[0];

        for (int i = 0; i < A; i++) {

            int sum = 0;
            for (int k = i; k < A; k++) {
                sum += C[k];
                System.out.println("sum " + sum);
                if (sum > ans && sum<=B) {
                    ans = sum;

                }

            }
            return ans;
        }

        return 0;
        //System.out.println("Max subarray is"+ans);
    }




    public static void main(String[] args) {
        int[] C=new int []{1,2,3,4,5,6} ;
        int A= C.length;
        int B=12;
        System.out.println("Max subarray is "+ arrray(C,B,A));

    }
}

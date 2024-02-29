public class SubarraysSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.printf("subArrAYSum " + findSum(arr));
    }

    private static long findSum(int[] A) {
        int ans=0;
        int c=5;
        int b = 2;
        for (int s = 0; s < A.length; s++) {
            int sum = 0;
            for (int e = s; e < A.length; e++) {
                sum+=A[e];
                if(sum==c && b==e-s+1){
                    System.out.println("yrss "+ sum+" s e "+s+e);
                }


           /*     ans +=sum;*/
           /*     System.out.print(" sum="+sum);*/
             /*   System.out.print(" ans="+ans);*/
            }

       /*     System.out.println(" ans final="+ans);*/
        }
        return ans;
    }
}

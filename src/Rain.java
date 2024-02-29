public class Rain {
    public static void main(String[] args) {
        int A[]={1, 2};
       int ans= trap(A);
        System.out.println(ans);
    }

    private static int  trap(int[] A) {
        int l=0;
        int r=A.length-1;
        int leftMax=Integer. MIN_VALUE;
        int rightMax=Integer. MIN_VALUE;
        int ans=0;
        while(l<r){
            if(A[l]>leftMax)
            {
                leftMax=A[l];
            }
            if(A[r]>rightMax){
                rightMax=A[r];
            }
            if(leftMax<rightMax){
                ans+=leftMax-A[l];
                l++;
            }
            else{
                ans+=rightMax-A[r];
                r--;
            }

        }
        return ans;

    }
}

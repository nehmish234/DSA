public class maxOneINRows {
    public static void main(String[] args) {
        int arr[][]={
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 1}
        };
        System.out.println(maxOnes(arr));
    }

    private static int maxOnes(int[][] arr) {
        int n= arr.length;
        int m= arr[0].length;
        int ans=0;

        int r=0;
        int c=m-1;
        while(r<n && c>=0){
            while(c>=0 && arr[r][c]==1){
                c--;
                ans=r;

            }
            r++;
        }

        return ans;
    }


}

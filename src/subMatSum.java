public class subMatSum {
    public static void main(String[] args) {
        int arr[] []= {{3,1},{-1,-2},{2,4}};
        System.out.println(printSubMat(arr));

    }

    private static int printSubMat(int[][] arr) {
        int n=arr.length;
        int m= arr[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                int cont= ((i+1) * (j+1)) * ((n-i)* (m-j));
                ans+=cont*arr[i][j];
            }
        }

        return ans;

    }

}

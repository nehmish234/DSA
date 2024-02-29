public class MissingPosInteger {
    public static void main(String[] args) {
        int A[]={-8, -7, -6};
        System.out.println(posInteger(A));
    }

    private static int posInteger(int[] a) {
        int n= a.length;
        int i=0;
        while(i<n){
            if(a[i]>0 && a[i]<=n){
                int index=a[i]-1;
                if(a[i]==a[index])
                    i++;
                else{
                    int temp=a[i];
                    a[i]=a[index];
                    a[index]=temp;
                }
            }
            else{
                i++;
            }
        }
        for( i=0;i<n;i++){
            if(a[i]!= i+1)
                return i+1;
        }
        return n+1;
    }
}

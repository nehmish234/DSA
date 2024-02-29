public class magic {
    public static void main(String[] args) {
        int n=7;
        System.out.println(binRep(n));
    }

    private static int binRep(int n) {
        if(n==0) {
            return 0;
        }
        else {

            return binRep(n/2) * 10 + n % 2;
        }
    }
}
//time complexity for this program is logn because problem is getting half means log2n if problem is by 3 then log3n
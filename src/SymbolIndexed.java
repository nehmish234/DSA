public class SymbolIndexed {
    public static void main(String[] args) {
        int A=4;
        int B= 4;
        System.out.println(solve(A,B));
    }

    private static int solve(int a, long b) {
        if (a == 1) {

            return 0;

        }
        int prevRowSymbol = solve(a - 1, b / 2);
        return (prevRowSymbol == 0) ? (int)b % 2 : 1 - ( (int)b % 2);

    }

}

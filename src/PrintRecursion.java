public class PrintRecursion {
    public static void main(String[] args) {
        int A = 10;
        Print(A);
        System.out.println();
    }

    private static void Print(int a) {
        if (a <= 0) return ;
        else Print(a - 1);
        System.out.print(a + " ");
    }

}

public class boundaryElem {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 5,}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        printBEle(arr);
    }

    private static void printBEle(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = 0;
        for (int k = 1; k < m; k++) {
            System.out.print(arr[i][j]);
            System.out.print(" ");
            j++;
        }
        System.out.println(" ");
        for (int k = 1; k < n; k++) {
            System.out.print(arr[i][j]);
            System.out.print(" ");
            i++;
        }
        System.out.println(" ");
        for (int k = 1; k < m; k++) {
            System.out.print(arr[i][j]);
            System.out.print(" ");
            j--;
        }
        System.out.println(" ");
        for (int k = 1; k < n; k++) {
            System.out.print(arr[i][j]);
            System.out.print(" ");
            i--;
        }

    }

}

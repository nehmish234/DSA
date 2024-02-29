import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    public  int[][] solution(int A) {
        List<int[]> move = new ArrayList<>();
        moveDisks(A, 1, 3, move);
        return move.toArray(new int[0][]);


    }

    private  void moveDisks(int a, int start, int end, List<int[]> move) {
        if (a == 1) {


             move.add(new int[]{a, start, end});
        }
        else {
            int aux = 6- start - end;

            moveDisks(a-1, start,aux,move);
            move.add(new int[]{a, start, end});
            moveDisks(a - 1, aux, end, move);

        }
    }
    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        int a = 2; // Number of disks
        int[][] ans = toh.solution(a);
        for (int[] moves : ans) {
            System.out.println(moves[0] + " " + moves[1] + " " + moves[2]);
        }
    }
}

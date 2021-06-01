package contest;

import java.util.Scanner;

public class DirectedT3MemberedRingCount {
    public int countRing() {
        int count = 0;
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nn = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nn[i][j] = scanner.nextInt();
            }//of for j
        }//of for i

    }
}

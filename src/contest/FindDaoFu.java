package contest;

import java.util.Scanner;

public class FindDaoFu {
    public void find(int[] paraDF, int[] paraQS) {
        for (int i = 0; i < paraQS.length; i++) {
            int count = 0;
            for (int j = 0; j < paraDF.length; j++) {
                if (paraDF[j] == paraQS[i]) {
                    System.out.println('Y');;
                } else {
                    count++;
                }
            }
            if (count == paraDF.length) {
                System.out.println('N');;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDF = scanner.nextInt();
        int[] dF = new int[numDF];
        for (int i = 0; i < numDF; i++) {
            dF[i] = scanner.nextInt();
        }
        int numQues = scanner.nextInt();
        int[] qS = new int[numQues];
        for (int i = 0; i < numQues; i++) {
            qS[i] = scanner.nextInt();
        }
        FindDaoFu findDaoFu = new FindDaoFu();
        findDaoFu.find(dF, qS);
    }
}

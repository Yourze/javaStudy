package contest;

import java.util.Arrays;

public class SortJiOu {
    public void sort(int[] paraArray) {
        int len = paraArray.length;;
        //Step 1.Put even number at th end of array
        for (int i = 0; i < paraArray.length; i++) {
            if (paraArray[i] % 2 == 0) {
                int temp = paraArray[i];
                for (int j = i; j < len - 1; j++) {
                    paraArray[j] = paraArray[j + 1];
                }
                paraArray[len] = temp;
            }
        }
//        for (int i = 0; i < paraArray.length - 1; i++) {
//            for (int j = 0; j < paraArray.length - 1 - i; j++) {
//                if (paraArray[j] < paraArray[j + 1]) {
//                    int temp = paraArray[j];
//                    paraArray[j] = paraArray[j + 1];
//                    paraArray[j + 1] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(paraArray));
    }//End sort
    public static void main(String[] args) {
        int[] a = {2,1,5,6,3,7,9,43,20};
        SortJiOu s = new SortJiOu();
        s.sort(a);
    }
}

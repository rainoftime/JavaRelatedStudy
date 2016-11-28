package tests.homework.driver;

import catg.CATG;

import java.util.Arrays;

/**
 * Created by cheyulin on 11/28/16.
 */
public class MinSubArrTestDriver {

    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static tests.homework.IntArrayUtil srcUtil = new tests.homework.IntArrayUtil();

    public static void main(String[] args) {
        int targetVal = CATG.readInt(5);
        for (int arrLen = 1; arrLen < 10; arrLen++) {
            int[] arr0 = Utility.generateArray(arrLen);
            int[] arr1 = Arrays.copyOf(arr0, arr0.length);
            int[] input = Arrays.copyOf(arr0, arr0.length);

            int srcVal = srcUtil.findMinSubArrayLen(targetVal, arr0);
            int jarVal = jarUtil.findMinSubArrayLen(targetVal, arr1);

            Utility.printInput(input, targetVal);
            Utility.compareAndPrintResult(srcVal, jarVal);
        }
    }

}

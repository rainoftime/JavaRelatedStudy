package study;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cheyulin on 11/23/16.
 */

public class Study {

    private static util.IntArrayUtil jarUtil = new util.IntArrayUtil();
    private static error.IntArrayUtil srcUtil = new error.IntArrayUtil();
    private static correct.IntArrayUtil decompileUtil = new correct.IntArrayUtil();

    private static void printArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Input Array:[");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i != arr.length - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');
        System.out.println(stringBuilder.toString());
    }

    private static void printArray(int[] arr, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < length; i++) {
            stringBuilder.append(arr[i]);
            if (i != length - 1) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');
        System.out.println(stringBuilder.toString());
    }

    private static boolean compareArray(int[] left, int[] right) {
        if (left.length != right.length)
            return false;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i])
                return false;
        }
        return true;
    }

    private static void studyFindMInViaIteration() {

        System.out.println("\nstudyFindMInViaIteration");
        int[] arr = {11, -2, -33, 4, -5};
        int[] arr2 = {11, 3, 3, 5, -10};

        System.out.println(jarUtil.findMinViaIteration(arr));
        System.out.println(jarUtil.findMinViaIteration(arr2));
        System.out.println(srcUtil.findMinViaIteration(arr));
        System.out.println(srcUtil.findMinViaIteration(arr2));
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("correct:" + arr[0]);
        System.out.println("correct:" + arr2[0]);
    }

    private static void studyFindMinViaRecursion() {
        System.out.println("\nstudyFindMinViaRecursion");
        int[] arr = {11, -2, -33, 4, -5};
        int[] arr2 = {11, 3, 3, 5, -10};
        System.out.println(jarUtil.findMinViaRecursion(arr));
        System.out.println(jarUtil.findMinViaRecursion(arr2));
        System.out.println(srcUtil.findMinViaRecursion(arr));
        System.out.println(srcUtil.findMinViaRecursion(arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("correct:" + arr[0]);
        System.out.println("correct:" + arr2[0]);
    }


    private static void studyRemoveDuplicateElements() {
        System.out.println("\nstudyRemoveDuplicateElements");
        int[] num = {1, 1, 1, 3, 3, 3, 3, 3, 3, 2, 2, 0, 0, 2};
        int[] num2 = {1, 1, 1, 3, 3, 3, 3, 3, 3, 2, 2, 0, 0, 2};

        int length = jarUtil.removeDuplicateElements(num);
        printArray(num, length);

        int length2 = srcUtil.removeDuplicateElements(num2);
        printArray(num2, length2);
    }


    private static void studyKthLargestViaQuickSort() {
        System.out.println("\nstudyKthLargestViaQuickSort");
        int[] num = {2, 3, 4, 2, -3, 0, 1, 5, 6, 7, 5};
        int[] num1 = {2, 3, 4, 2, -3, 0, 1, 5, 6, 7, 5};
        int[] num2 = {2, 3, 4, 2, -3, 0, 1, 5, 6, 7, 5};
        for (int k = 1; k < num.length + 1; k++) {
            System.out.println("jar_util:" + jarUtil.findKthLargestViaQuickSort(num, k));
            System.out.println("src_util:" + srcUtil.findKthLargestViaQuickSort(num1, k));
            Arrays.sort(num2);
            System.out.println("quick_sort:" + num2[num2.length - k]);
            System.out.println();
        }
    }

    private static void studyFindMinSubArrayLen() {
        System.out.println("\nstudyFindMinSubArrayLen");
        int[] num = {1, 2, -3, -2, 0};
        System.out.println(jarUtil.findMinSubArrayLen(-2, num));
        System.out.println(jarUtil.findMinSubArrayLen(-4, num));
        System.out.println(srcUtil.findMinSubArrayLen(-2, num));
        System.out.println(srcUtil.findMinSubArrayLen(-4, num));

        System.out.println();
        int[] num2 = {1, 2, 3, 2, 0};
        System.out.println(jarUtil.findMinSubArrayLen(6, num2));
        System.out.println(jarUtil.findMinSubArrayLen(5, num2));
        System.out.println(srcUtil.findMinSubArrayLen(6, num2));
        System.out.println(srcUtil.findMinSubArrayLen(5, num2));

    }

    private static void studyGetNextPermutationNumber() {
        System.out.println("\nstudyGetNextPermutationNumber");
        int[] input = {1, 2, 3, 4, 5};
        for (int i = 0; i < 120; i++) {
            jarUtil.getNextPermutationNumber(input);
            int[] num1 = new int[input.length];
            System.arraycopy(input, 0, num1, 0, input.length);
            int[] num2 = new int[input.length];
            System.arraycopy(input, 0, num2, 0, input.length);
        }

        System.out.println();

//        int[] num2 = {1, 2, 3, 4};
//        for (int i = 0; i < 24; i++) {
//            srcUtil.getNextPermutationNumber(num2);
//            printArray(num2);
//        }
    }

    private static void studyThreeSumClosest() {
        System.out.println("\nstudyThreeSumClosest");
        int num[] = {1, 1, 1, 1};
        System.out.println(jarUtil.threeSumClosest(num, 1));
        System.out.println(srcUtil.threeSumClosest(num, 1));
    }


    private static void confirmJanalaGetPermutationNumber() {
        int[] num = {-1, 0, 0};
        int[] num2 = new int[3];
        System.arraycopy(num, 0, num2, 0, num.length);
        printArray(num);
        printArray(num2);

        jarUtil.getNextPermutationNumber(num);
        printArray(num);
        srcUtil.getNextPermutationNumber(num2);
        printArray(num2);
    }

    public static void main(String[] args) {
        //Faulty Ones
        studyGetNextPermutationNumber();
//        studyThreeSumClosest();

        //Others
//        studyRemoveDuplicateElements();
//        studyFindMinSubArrayLen();
//        studyFindMInViaIteration();
//        studyFindMinViaRecursion();

//        studyKthLargestViaQuickSort();

        //Confirmation
//        confirmJanalaGetPermutationNumber();
    }
}

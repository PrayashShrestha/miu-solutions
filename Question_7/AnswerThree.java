package Question_7;

/* 
 * Question 15
        Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
        1. it has even numbers of elements
        2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.

        If you are programming in Java, the function Signature is
        int answerThree(int[] a)
        Examples
        -------------------|--------|-----------------------------------------------------------------------
        | a                 | return | Explanation                                                           |
        |-------------------|--------|-----------------------------------------------------------------------|
        | {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
        |                   |        | satisfied.                                                            |
        |                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
        -------------------|--------|-----------------------------------------------------------------------
 */
public class AnswerThree {
    static int answerThree(int[] arr) {
        if (arr.length % 2 != 0)
            return 0;

        int midInd = arr.length / 2;
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < midInd) {
                leftSum = leftSum + arr[i];
            } else {
                rightSum = rightSum + arr[i];
            }

        }
        if (leftSum == rightSum)
            return 1;
        return 0;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 4, 3, 2, 3, 4, 6, 1 };
        System.out.println(answerThree(arr));
    }
}

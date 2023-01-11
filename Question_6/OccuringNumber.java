package Question_6;

/* 
 * Question 14
        Write a function that will return the most occurring number in an array. If there is more than
        one such number, the function may return any one of them.
        If you are programming in Java or C#, the function signature is int answerTwo(int[] a)

        Examples
        -------------------------|----------|------------------------------------------------------------
        | a                       | return   | Explanation                                                |
        |-------------------------|----------|------------------------------------------------------------|
        | {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
        |-------------------------|----------|------------------------------------------------------------|
        | {6,8,1,8,6}             | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
        -------------------------|----------|------------------------------------------------------------
 */
public class OccuringNumber {
    static int occuranceNumber(int[] arr) {
        int maxNum = 0, maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
        }

        return maxNum;
    }

    public static void main(String args[]) {
        int[] arr = { 6, 8, 1, 8, 6 };
        System.out.println(occuranceNumber(arr));
    }
}

package Question_8;

/* 
 * Question 16
        A Madhav array has the following property.
        a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
        The length of a Madhav array must be n*(n+1)/2 for some n.
        Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
        otherwise it returns 0. If you are programming in Java or C# the function signature is
        int isMadhavArray(int[] a)

        Examples
        -----------------------------------|-------|---------------------------------------------------
        | if a is                           | return| reason                                            |
        |-----------------------------------|-------|---------------------------------------------------|
        | {2,1,1}                           | 1     | 2 = 1 + 1                                         |
        |-----------------------------------|-------|---------------------------------------------------|
        | {2,1,1,4,-1,-1}                   | 1     | 2 = 1 + 1, 2 = 4 + -1 + -1                        |
        |-----------------------------------|-------|---------------------------------------------------|
        | {6,2,4,2,2,2,1,5,0,0}             | 1     | 6 = 2 + 4, 6 = 2 + 2 + 2, 6 = 1 + 5 + 0 + 0       |
        |-----------------------------------|-------|---------------------------------------------------|
        | {18,9,10,6,6,6}                   | 0     | 18 != 9 + 10                                      |
        |-----------------------------------|-------|---------------------------------------------------|
        | {-6,-3,-3,8,-5,-4}                | 0     | -6 != 8 + -5 + -4                                 |
        |-----------------------------------|-------|---------------------------------------------------|
        | {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1} | 1     | 0 = 0+0, 0 = 0+0+0, 0 = 0+0+0+0, 0 = 1+1+1+-2+-1  |
        |-----------------------------------|-------|---------------------------------------------------|
        | {3,1,2,3,0}                       | 0     | The length of the array is 5, but 5 != n*(n+1)/2  |
        -----------------------------------|-------|---------------------------------------------------
 */
public class IsMadhavArray {
    static int isMadhavArray(int[] arr) {

        int arrLen = arr.length;
        int sum_of_n = 0;

        if (arr.length < 3)
            return 0;

        // test for natural number sum length of the array
        for (int i = 0; i < arrLen; i++) {
            sum_of_n = i * (i + 1) / 2;

            if (sum_of_n == arrLen) {
                break;
            }

            else if (sum_of_n > arrLen)
                return 0;
        }

        int startIndex = 1, count = 1, firstvalue = arr[0], endIndex = startIndex + count;

        while (startIndex < arrLen) {
            int tempSum = 0;

            for (int i = startIndex; i <= endIndex; i++) {
                tempSum = tempSum + arr[i];
            }

            if (tempSum != firstvalue)
                return 0;

            count++;
            startIndex = endIndex + 1;
            endIndex = startIndex + count;

        }
        return 1;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 1, 1, 4, -1, -1 };
        System.out.println(isMadhavArray(arr));
    }
}

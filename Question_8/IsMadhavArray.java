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
    static int isMadhavArray(int[] array) {
        if (array.length == 0) return 0;
        int n = 1;
        int expectedSum = n*(n+1)/2 * array[0];
        int start = 0;
        while (start < array.length) {
            int currentSum = 0;
            int end = start + n;
            if(end > array.length) return 0;
            for(int i = start; i < end; i++) {
                currentSum += array[i];
            }
            if(currentSum != expectedSum) return 0;
            n++;
            start = end;
        }
        return 1;
    }

    public static void main(String args[]) {
        int result = isMadhavArray(new int[]{2, 1, 1});
        System.out.println(result);
         result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
         System.out.println(result);
         result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
         System.out.println(result);
         result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
         System.out.println(result);
         result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
         System.out.println(result);
         result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
         System.out.println(result);
         result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
         System.out.println(result);
    }
}

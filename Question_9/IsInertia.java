package Question_9;

import java.util.ArrayList;
import java.util.Collections;

/* 
 * Question 17
An array is defined to be inertial if the following conditions hold:
a. it contains at least one odd value
b. the maximum value in the array is even
c. every odd value is greater than every even value that is not the maximum value.
so {11,4,20,9,2,8} is inertial because
 - it contains at least one odd value
 - the maximum value in the array is 20 which is even
 - the two odd values (11 and 9) are greater than all the even values that are not
equal to 20 (the maximum), i.e {4,2,8}.
However, {12,11,4,9,2,3,10} is not inertial because it fails condition (c), i.e.
10 (which is even) is greater than 9 (which is odd), and 10 is not the maximum value
in the array.

Write a function called isInertial that accepts an integer array and returns 1 if the array
is inertial; otherwise it returns 0.
If you are programing in Java or C#, the function signature is
int isInertial(int[] a)

Some other examples:
 -----------------------|--------|-----------------------------------------------------------------------
| if the input array is | return | reason                                                                |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1}                   | 0      | fails condition (a) - the maximum value must be even                  |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2}                   | 0      | fails condition (b) - the array must contain at least one odd value   |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1,2,3,4}             | 0      | fails condition (c) - 1(which is odd) is not greater than all even    |
|                       |        | values other than the maximum (1 is less than 2 which is not the max) |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1,1,1,1,1,1,2}       | 1      | there is no even number other than the maximum. Hence, there can be no|
|                       |        | other even values that are greater than 1.                            |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,12,4,6,8,11}       | 1      | 11, the only odd value is greater than all even values except 12 which|
|                       |        | is the maximum value in the array.                                    |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,12,12,4,6,8,11}    | 1      | same as previous, ie, it is ok if maximum value occurs more than once |
|-----------------------|--------|-----------------------------------------------------------------------|
| {-2,-4,-6,-8,-11}     | 0      | -8, which is even, is not the maximum value but is greater than -11   |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,3,5,7}             | 0      | the maximum value is odd                                              |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,4,6,8,10}          | 0      | there is no odd value in the array                                    |
 -----------------------|--------|-----------------------------------------------------------------------

NOTE: To ease debugging, i will return a string
 */
public class IsInertia {
    static int isInertial(int[] arr) {
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> evenArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // add to odd array and even array
            if (arr[i] % 2 == 0) {
                evenArray.add(arr[i]);
            } else {
                oddArray.add(arr[i]);
            }
        }

        // check the length of odd array
        // sort the arrays
        // save the max and second max value of the even array
        // compare the min value of odd array with all items in even array
        // so that it proves each odd value is greater than even value other than max even value
        // check if the max value in the whole array is even

        if (oddArray.size() == 0) {
            return 0;
        }

        // sorting odd and even array
        Collections.sort(evenArray);
        Collections.sort(oddArray);

        // finding max and second max value in the even array
        int maxEvenValue = evenArray.get(evenArray.size() - 1); // max even value in the array

        // finding min and max odd value in the odd array
        int minOddValue = oddArray.get(0); // min odd value
        int maxOddValue = oddArray.get(oddArray.size() - 1); //max odd value

        // compare each item in even array except max value with the least odd item
        for( int i = 0; i < evenArray.size()-2; i++) {
            if (evenArray.get(i) > minOddValue) {
                return 0;
            }
        }

        // check if the even max value is the greater than max odd value
        if (maxOddValue > maxEvenValue){
            return 0;
        }

        return 1;
    }

    public static void main(String args[]) {
        int[] arr = {2,12,12,4,6,8,11}  ;
        System.out.println(isInertial(arr));
    }

}

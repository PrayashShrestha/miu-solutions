package Question_2;

/* 
 * Question 10
    A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
    are 1 and any fancy number other than the first two is sum of three times previous one and two times
    the one before that. see below
    1,
    1,
    3*1 + 2*1 = 5,
    5*3 + 2*1 = 17,
    17*3 + 5*2 = 61
    Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
    otherwise it returns 0.
 */
public class IsFancy {
    static int isFancy(int[] arr) {
        if (arr[0] != 1 && arr[1] != 1)
            return 0;

        for (int i = 2; i < arr.length; i++) {
            if ((arr[i - 1] * 3) + (arr[i - 2] * 2) != arr[i])
                return 0;
        }
        return 1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 5, 17, 61 };
        System.out.println(isFancy(arr));
    }
}

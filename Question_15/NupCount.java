package Question_15;

/*
* Question 8
Define the n-upcount of an array to be the number of times the partial sum goes from less than
or equal to n to greater than n during the calculation of the sum of elements of the array.
if you are programming in Java or C#, the function signature is int nUpCount(int[] a, int n)

For example, if n=5, the 5-upcount of the array {2,3,1,-6,8,-3,-1,2} is 3.
 ------|------|--------------|---------|---------------------------------
| i    | a[i] | partial sum  | upcount | comment                         |
|------|------|--------------|---------|---------------------------------|
| 0    | 2    | 2            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 1    | 3    | 5            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 2    | 1    | 6            | 1       | partial sum goes from 5 to 6    |
|------|------|--------------|---------|---------------------------------|
| 3    | -6   | 0            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 4    | 8    | 8            | 2       | partial sum goes from 0 to 8    |
|------|------|--------------|---------|---------------------------------|
| 5    | -3   | 5            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 6    | -1   | 4            |         |                                 |
|------|------|--------------|---------|---------------------------------|
| 7    | 2    | 6            | 3       | partial sum goes from 4 to 6    |
 ------|------|--------------|---------|---------------------------------
* */
public class NupCount {
    static int nUpCount(int[] arr, int n){
        int nCount = 0, sum=0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            if(sum > n && (i==0 || sum - arr[i] <= n) )
            {
                nCount++;
            }
        }
        return nCount;
    }

    /*
    * (i==0 || sum - arr[i] <= n)
    * if the first index is zero and the sum is larger than n then it satisfies the condition
    * sum-arr[i]<=0 means that the current sum if exceeds than n then
    * previous to the sum of arr[i] must be less than or equals to n
    * */
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{1, 2, 3, -1, -2}, 2));
    }
}

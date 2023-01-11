package Question_12;

public class IsSym {
    static boolean isEven(int num){
        return num % 2 == 0;
    }
    static int isSym(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(isEven(arr[start]) != isEven(arr[end])) return 0;
            start = start + 1;
            end = end - 1;
        }

        return 1;
    }
    public static void main(String[] args){
        int[] arr = {2,7,9,10,11,5,8};
        System.out.println(isSym(arr));

    }
}

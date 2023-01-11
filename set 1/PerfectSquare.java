import java.util.*;

public class PerfectSquare {
    static int nextPerfectSquare(int n) {
        
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            int nextNum = (int) Math.floor(Math.sqrt(n) + 1);
            return nextNum * nextNum;
        }
    }

    public static void main(String args[]){
        int n = 35;
        System.out.println(nextPerfectSquare(n));
    }
}
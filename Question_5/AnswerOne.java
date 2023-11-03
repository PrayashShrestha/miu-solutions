package Question_5;

/* 
 * Question 13
    Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
    Thus 50 can be expressed as a sum of the two squares in two different ways.
    Write a method whether or not a positive integer n can be expressed as a sum of two squares in
    exactly two different ways.
    The signature of the function is
        int answerOne(int n)
 */
public class AnswerOne {
    static String answerOne(int n) {
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(n == i*i + j*j){
                    sum ++;
                    System.out.println(i+" * " +i+ " + "+j+ " * "+j);
                }
            }
        }
        return sum > 1 ? 1:0;
    }

    public static void main(String args[]) {
        System.out.println(answerOne(25));
    }
}

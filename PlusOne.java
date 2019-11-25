import sun.rmi.runtime.Log;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[] {1,2,3};
        int[] digitsRst = plusOne(digits);
        System.out.println( Arrays.toString(digitsRst));
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int temp = 1;
        for (int i = len -1; i >= 0 ; i--) {
            int value = (digits[i] + temp );
            temp = value/10;
            digits[i] = value % 10;
        }
        if(temp > 0) {
            digits = new int[len +1];
            digits[0] = 1;
        }
        return digits;
    }
}

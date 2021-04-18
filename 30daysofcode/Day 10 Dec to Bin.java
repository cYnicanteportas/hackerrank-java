import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        //only works for numbers up to 64 bit ints
        int[] numbers = new int[64];
        
        //modulo 2 on input to generate binary number, needs to be reversed
        for (int i = 0; i <= 63; i++){
            if (n % 2 == 0){
                numbers[i] = 0;
            }
            else {
                numbers[i] = 1;
            }
            n = n /2;
/*            if (n == 0) {
                break;
                }
*/

        }
        
        //reversal
        int[] numbersRev = new int[64];
        for (int j = 0; j <= 63; j++){
            numbersRev[j] = numbers[63-j];
        }
        
        //could cut off leading 0s, reversal actually also not necessary but easier to           //think about
        
        //counting max numbers of 1s in a row
        int currentCount = 0;
        int maxCount = 0;
        for(int i = 0; i <= 63; i++){
            if (numbersRev[i] == 1){
                currentCount = currentCount +1;
                if (maxCount < currentCount){
                maxCount = currentCount;
                }
            }
            if (numbersRev[i] == 0){
                if (maxCount < currentCount){
                maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
      //  System.out.println(Arrays.toString(numbersRev));
        System.out.println(maxCount);        
    }
}
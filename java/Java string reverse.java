import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int stringLength = A.length();
        StringBuilder Reversed = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++){
            Reversed.append(A.charAt(stringLength-1-i));
        }

        if (Reversed.toString().equals(A)){
        System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

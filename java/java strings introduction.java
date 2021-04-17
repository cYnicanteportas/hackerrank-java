import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        //Sum of length a + b
        int sum = A.length() + B.length();
        System.out.println(sum);
        
        //lexicographical comparison
        int comp = A.compareTo(B);
        if (comp > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        //capitalisation
        
        //Stringbuilder to get 1. char capitalised then loop to add rest
        StringBuilder Astring = new StringBuilder();
        Astring.append(Character.toUpperCase(A.charAt(0)));
        int Alength = A.length();
        for (int i = 1; i < Alength; i++){
            Astring.append(A.charAt(i));
        }
        System.out.print(Astring.toString() + " ");
        
        StringBuilder Bstring = new StringBuilder();
        Bstring.append(Character.toUpperCase(B.charAt(0)));
        int Blength = B.length();
        for (int i = 1; i < Blength; i++){
            Bstring.append(B.charAt(i));
        }
        System.out.print(Bstring.toString());
    }
}


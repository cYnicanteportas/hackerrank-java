import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }
        
        //we're going to use Bubblesort also need to track the # of swaps
        int totalSwaps          = 0;
        int endPosition         = a.size() -1;
        int startingPosition    = 0;
        int temp                = 0;
        
        //outer loop checks where we last swapped and only stops if we iterated over the         //entire array without swapping
        while (endPosition > 0){
        startingPosition = 0;    
            
        //iterate over every entry
        for (int i = 0; i < endPosition; i++){
            
            //floating of values backwards
            if(a.get(i) > a.get(i+1)){
                temp    = a.get(i);
                a.set(i, a.get(i+1));
                a.set(i+1, temp);
                totalSwaps +=1;
                startingPosition = i;
            }  
            
        }
        
        endPosition = startingPosition;
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: "+ a.get(a.size()-1));
        bufferedReader.close();
    }
}

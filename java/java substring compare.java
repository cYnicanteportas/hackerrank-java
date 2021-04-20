import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        //determine up to where you need to create new substrings for the loop
        int lastCharChecked = s.length() - k;
        
        //for some reason this breaks if you don't instantiate them
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        
        //iterate over all strings and compare
        for (int i = 0; i <= lastCharChecked; i++){
            String currentSub = s.substring(i, i+k);
            
            if (currentSub.compareTo(largest) > 0){
                largest = currentSub;
            }
            else if (currentSub.compareTo(smallest) < 0){
                smallest = currentSub;
            }

            
        }

        //System.out.println(lastCharChecked);
        return smallest + "\n" + largest;
    }


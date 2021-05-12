import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        //if not same length can't be equal
        if (a.length() != b.length()){
            return false;
        }
        //supposed to be case insensitive so only use lower
        String firstString  = a.toLowerCase();
        String secondString = b.toLowerCase();
        
        //convert to array to make iterating over easier
        char[] aChars = firstString.toCharArray();
        char[] bChars = secondString.toCharArray();
        
        //count chars in a
        int[] charFrequencies = new int[26];
        
        //every char has ascii value a smallest so it gets array spot 0, b is one larger            so it takes spot 1, etc
        for (int i = 0; i < a.length(); i++){
            char currentChar = aChars[i];
            int asciiIndex= currentChar - 'a';
            charFrequencies[asciiIndex] = charFrequencies[asciiIndex] +1;
        }
        
        //if b is anagram it reduces the frequencies back down to 0 since every char                occurs equally as often
        for (int i = 0; i < b.length(); i++){
            char currentChar = bChars[i];
            int asciiIndex = currentChar - 'a';
            charFrequencies[asciiIndex] = charFrequencies[asciiIndex] -1;
        }
        
        //if non 0 is in frequencies = no anagram
        for (int i = 0; i <= 25; i++){
            if (charFrequencies[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
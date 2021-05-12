import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] stringAContents = new int[26];
        int[] stringBContents = new int[26];
        
        fillArray(stringAContents, a);
        fillArray(stringBContents, b);
        
        return compareArrays(stringAContents, stringBContents);
    }
    
    //sorts characters into their array 
    static void fillArray(int[]a, String str){
        
        for (char ch : str.toCharArray()){
            switch(ch){
                case 'a':
                case 'A':
                    a[0] = a[0]+1;
                case 'b':
                case 'B':
                    a[1] = a[1]+1;
                case 'c':
                case 'C':
                    a[2] = a[2]+1;
                case 'd':
                case 'D':
                    a[3] = a[3]+1;
                case 'e':
                case 'E':
                    a[4] = a[4]+1;
                case 'f':
                case 'F':
                    a[5] = a[5]+1;
                case 'g':
                case 'G':
                    a[6] = a[6]+1;
                case 'h':
                case 'H':
                    a[7] = a[7]+1;
                case 'i':
                case 'I':
                    a[8] = a[8]+1;
                case 'j':
                case 'J':
                    a[9] = a[9]+1;
                case 'k':
                case 'K':
                    a[10] = a[10]+1;
                case 'l':
                case 'L':
                    a[11] = a[11]+1;
                case 'm':
                case 'M':
                    a[12] = a[12]+1;
                case 'n':
                case 'N':
                    a[13] = a[13]+1; 
                case 'o':
                case 'O':
                    a[14] = a[14]+1; 
                case 'p':
                case 'P':
                    a[15] = a[15]+1; 
                case 'q':
                case 'Q':
                    a[16] = a[16]+1; 
                case 'r':
                case 'R':
                    a[17] = a[17]+1; 
                case 's':
                case 'S':
                    a[18] = a[18]+1; 
                case 't':
                case 'T':
                    a[19] = a[19]+1; 
                case 'u':
                case 'U':
                    a[20] = a[20]+1; 
                case 'v':
                case 'V':
                    a[21] = a[21]+1; 
                case 'w':
                case 'W':
                    a[22] = a[22]+1; 
                case 'x':
                case 'X':
                    a[23] = a[23]+1; 
                case 'y':
                case 'Y':
                    a[24] = a[24]+1; 
                case 'z':
                case 'Z':
                    a[25] = a[25]+1; 
            }
        }

    }
    //checks if every entry is same number else returns false
    static boolean compareArrays(int[] one, int[] two){
        for (int i = 0; i <= 25; i++){
            if (one[i] == two[i]){
                //do nothing, so far everything is the same
            }
            else {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
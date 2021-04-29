import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] input){
        this.elements = input;
    }
    
    public void computeDifference(){
        int arrayLength = elements.length;
        int firstValue = 0;
        int secondValue = 0;
        int a = 0;
        int b = 0;
        int currentDifference = 0;
        
        for (int i = 0; i < arrayLength; i++){
            firstValue = elements[i];
            for (int j = 0; j < arrayLength; j++){
                secondValue = elements[j];
                
                if (firstValue >= secondValue){
                    a = firstValue;
                    b = secondValue;
                }
                else {
                    a = secondValue;
                    b= firstValue;
                }
                currentDifference = a-b;
                
                if (currentDifference > maximumDifference){
                    maximumDifference = currentDifference;
                }
            }
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
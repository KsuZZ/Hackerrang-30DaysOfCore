import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  Difference(int[] a){
     this.elements = a;
  }
	// Add your code here
    void computeDifference(){
        int in = elements.length * elements.length;
        int[] max = new int[in];
        int m = 0;
        for (int j = 1; j < elements.length; j++){
          for (int i = 0; i < elements.length; i++){
              if (elements[i] - elements[j] < 0){
              max[m] = (elements[i] - elements[j])*(-1);}
              else{
              max[m] = elements[i] - elements[j];}
              m++;
          }
        }
        maximumDifference = max[0];
        for (int i = 0; i < max.length; i++){
            if (maximumDifference < max[i]){
                maximumDifference = max[i];
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

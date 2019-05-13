import java.io.*;
import java.util.*;
import java.util.Stack;
import java.util.Queue;

public class Solution {
    Stack st = new Stack();
    Queue qu = new LinkedList<>();
    // Write your code here.
    public void pushCharacter(char c){ //помещает в стек
        st.push(c);
    }
    public void enqueueCharacter(char c){ //помещает в очередь
    qu.offer(c);
    }
    
    public char popCharacter(){ //возврат символа из верхней части стека
    char c = (char)st.pop();
       return (c);
    }
    public char dequeueCharacter(){ //возвращает первый символ из очереди
    char c = (char) qu.poll();
        return (c);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

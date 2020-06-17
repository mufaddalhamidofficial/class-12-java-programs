import java.util.*;

public class findPalinSentEachWord
{
    public static boolean checkPalindrome(String w) {
        w = w.toUpperCase();
        String tmpWord="";
        for(int i=w.length()-1;i>=0;i--){
            tmpWord=tmpWord+w.charAt(i);
        }
        // System.out.println("'"+tmpWord.trim() + "', '" + word.trim()+"'");
        return tmpWord.trim().compareTo(w.trim()) == 0;
    }
    
    public static void main(String args[]) {
        System.out.println("Please enter a sentence to check number of palindrome words");
        String sent = new Scanner(System.in).nextLine();
        int ctr = 0;
        String[] words=sent.split(" ");
        for(int i=0;i<words.length;i++){
            if(checkPalindrome(words[i])){
                ctr++;
                System.out.println(words[i]+" is Palindrome.");
            }
        }
        if(ctr == 0){
            System.out.println("There are no palindrome words in this sentence!");
            return;
        }
        System.out.println("Total number of palindrome words = "+(++ctr));
    }
}
//Madam Arora from Manam teaches us Malayalam
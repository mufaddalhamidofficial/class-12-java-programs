import java.util.*;
public class FascinatingNumber
{
    public static String concate(int num) {
        return num + "" + (num * 2) + "" + (num * 3);
    }
 
    public static String rmve0s(String n) { // This function removes zeros
        String nn = ""; // New num
        for(int i=0;i<n.length();i++){
            int a = Integer.parseInt(n.charAt(i) + "");
            if(a != 0) {
                nn = nn + n.charAt(i);
            }
        }
        return nn;
    }
    
    public static boolean checkNumsPrsnt(String n) {
        char[] num = n.toCharArray();
        if(num.length != 9)
            return false;
        for(int i=0;i<num.length;i++){ //arranging nums in accending order
            for(int j=0;j<num.length-1;j++){
                if(num[j] > num[j+1]){
                    char temp=num[j];
                    num[j] = num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<num.length-1;i++){
            if(num[i] == num[i+1])
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
            System.out.println("Enter a number");
            int num = new Scanner(System.in).nextInt();
            if(checkNumsPrsnt(rmve0s(concate(num)))){
                System.out.println("It is a Fascinating number");
                return;
            }
            System.out.println("Not a Fascinating number");
    }
}

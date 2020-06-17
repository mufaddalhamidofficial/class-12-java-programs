public class EvilNum
{
    
    public static String decimalToBinary(int a){
        String b="";
        
        while (a > 0)
        {
            int t=a%2;
            b=t+b;
            a=a/2;
        } 
        
        return b;
    }
    
    public static boolean check(String binary){
        int ctr=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                ctr++;
            }
        }
        return ctr%2==0;
    }
    
    
    public static void main(String args[]){
        System.out.print("N: ");
        int num = (new java.util.Scanner(System.in)).nextInt();
        System.out.print("Evil Numbers:");
        for(int i=1;i<=num;i++){
            System.out.print(check(decimalToBinary(i))?"\n"+i:"");
        }
    }
}

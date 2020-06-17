public class incOrDecOrBouncy
{
    public static boolean checkInc(int num){
        String strNum = num + "";
        boolean isInc = true;
        for(int i=0;i<strNum.length()-1;i++){
            int pn = Integer.parseInt(strNum.charAt(i)+"");
            int nn = Integer.parseInt(strNum.charAt(i+1)+"");
            if(pn>nn){
                isInc = false;
            }
        }
        return isInc;
    }

    public static boolean checkDec(int num){
        String strNum = num + "";
        boolean isDec = true;
        for(int i=0;i<strNum.length()-1;i++){
            int pn = Integer.parseInt(strNum.charAt(i)+"");
            int nn = Integer.parseInt(strNum.charAt(i+1)+"");
            if(pn<nn){
                isDec = false;
            }
        }
        return isDec;
    }
    
    public static void main(String args[]){
        System.out.println("Please enter a num");
        int num = (new java.util.Scanner(System.in)).nextInt();
        if(checkInc(num)){
            System.out.println("It is an increasing num");
        } else if(checkDec(num)){
            System.out.println("It is a decreasing num");
        } else {
            System.out.println("It is a bouncy num");
        }
    }
}

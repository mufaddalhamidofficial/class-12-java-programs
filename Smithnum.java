public class Smithnum
{
    public static boolean isPrime(int n){
        int ctr=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                 ctr++;
            }
        }
        return ctr==1;
    }
    
    public static int PrimeFactorizationSum(int num){
        int tn=num;
        int ctr=0;
        for(int i=2;i<tn;i++) {
            while(tn%i==0) {
                ctr+=i;
                tn=tn/i;
            }
        }
        if(tn>2) {
            ctr+=tn;
        }
        return ctr;
    }
    
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            int tn=num%10;
            sum+=tn;
            num=num/10;
            if(num<=0&&sum>=10){
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
    
    public static boolean check(int num){
        if(!isPrime(num)){
            int sdn=sumOfDigits(num); //Sum of digits of num
            int sprmfct=PrimeFactorizationSum(num); //Sum of Prime Factorization
            int sdsprmfct=sumOfDigits(sprmfct); //Sum of digits of Sum Prime Factorization
            if(sdn==sdsprmfct){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        System.out.println("Please enter a number to be checked");
        int num=new java.util.Scanner(System.in).nextInt();
        if(num>=2&&num<=200){
            if(check(num)){
                System.out.println("Given number is Smith number");
            }
            else{
                System.out.println("Given number is not Smith number");
            }
        }
        else{
            System.out.println("Number out of range");
        }
        System.out.println("----------------------\n\n");
    }
}

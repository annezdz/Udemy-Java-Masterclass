package section5;

public class InterestRate {
    public static void main(String[] args) {
     //   System.out.println("10.000 at 2% interesting : " + calculateInteresting(10000.00,2.0));

        for(int i = 2; i < 9; i++){
            System.out.println("10.000 at + " + i + " % interesting : " + calculateInteresting(100000.00,i));
            i++;
        }

        for(int i = 9; i > 2; i--){
            System.out.println("10.000 at + " + i + " % interesting : " + calculateInteresting(100000.00,i));
            i--;
        }

        int count = 0;
        for (int i = 10; i < 50; i ++){
            if(isPrime(i)){
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3){
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInteresting(double amount, double interestRate){
        return (amount * ( interestRate / 100));
    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

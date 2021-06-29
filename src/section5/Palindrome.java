package section5;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number){
        int reverse = number;
        int lastDigit = 0;
        int sum = 0;
        while(number > 0){
            lastDigit = number % 10;
            sum = (sum * 10) + lastDigit;
            number /= 10;
        }
        if(reverse == sum){
            return true;
        }else{
            return false;
        }
    }
}

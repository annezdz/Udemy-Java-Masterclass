package section5;

public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));


    }


    public static boolean hasSameLastDigit(int a , int b , int c){
        if(!(a > 9 && a < 1001 && b > 9 && b < 1001 && c > 9 && c < 1001)){
            return false;
        }
        else if (a % 10 == b % 10  || a % 10 == c % 10 || b % 10 == c % 10){
            return true;
        }
        return false;
    }
}

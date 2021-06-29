package section5;

public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasShareDigit(12, 23));
        System.out.println(hasShareDigit(9, 99));
        System.out.println(hasShareDigit(15, 55));


    }

    public static int firstDigit(int a) {
        a = a % 10;
        return a;
    }

    public static int lastDigit(int a) {
        a = a / 10;
        return a;
    }

    public static boolean hasShareDigit(int a, int b) {
        {
            if (((a > 9 && a < 100) && (b > 9 && b < 100))) {
                if (firstDigit(a) == firstDigit(b) || firstDigit(a) == lastDigit(b)) {
                    return true;
                }
                if (lastDigit(a) == firstDigit(b) || lastDigit(a) == lastDigit(b)) {
                    return true;
                }
            }
            return false;

        }
    }
}




package section5;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(2));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int sumEven = 0;

        if (number < 0) {
            return -1;
        }
        do {
            int lastDigit = 0;
            int count = 0;
            if (count == 0 || number / 10 == 0) {
                lastDigit += number % 10;
                if (lastDigit % 2 == 0) {
                    sumEven += lastDigit;
                }
            }
            count++;
            number /= 10;
        } while (number > 0);
        return sumEven;
    }
}


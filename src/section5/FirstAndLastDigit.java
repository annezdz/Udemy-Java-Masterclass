package section5;

public class FirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(11));
        System.out.println(sumFirstAndLastDigit(123456789));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(-22));


    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int count = 0;
        do{
            if(number < 10){
                sum = number + number;
            }
            else if(count == 0 || number / 10 == 0){
                sum += number % 10;
            }
            count ++;
            number /= 10;
        }while (number > 0);
        return sum;
    }
}



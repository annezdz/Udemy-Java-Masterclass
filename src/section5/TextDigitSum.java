package section5;

public class TextDigitSum {

    public static void main(String[] args) {

        System.out.println(sumDigits(202020));
    }

    public static int sumDigits(int number){
        int sum = 0;
        int digit = 0;
        if(number >=10){
            while (!(number == number/10)){
                digit = number % 10;
                sum+= digit;
                number = number / 10;
            }
            return sum;
        }else{
            return -1;
        }
    }

    //Tim version

//    private static int sumDigits(int number){
//        if(number < 10){
//            return -1;
//        }
//
//        int sum = 0;
//        while(number > 0){
//            int digit = number % 10;
//            sum+=digit;
//            number /= 10;
//        }
//        return sum;
//    }
}

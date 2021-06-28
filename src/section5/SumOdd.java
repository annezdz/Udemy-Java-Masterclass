package section5;

public class SumOdd {
    public static void main(String[] args) {

        System.out.println(isOdd(10));
        System.out.println(isOdd(15));
        System.out.println(isOdd(1));
        System.out.println(isOdd(100));

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));


    }

    public static boolean isOdd(int num) {
        if (num <= 0 || (num % 2 == 0)){
            return false;
        }else{
            return true;
        }
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > end && (start <= 0  && end <= 0)){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if (isOdd(i)) {
                sum+=i;
            }
        }
        return sum;
    }
}

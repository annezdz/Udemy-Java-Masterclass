package section5;

public class Sum3And5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i = 1; i < 1001; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                count ++;
                System.out.println("The number " + i + " is divided by 3 or 5 ");
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }


}

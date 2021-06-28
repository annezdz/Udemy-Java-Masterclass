package section5;

public class WhileExaple {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(10));
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(1));
        System.out.println(isEvenNumber(2));


//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is : " + count);
//            count++;
//        }

//        for(count = 1 ; count < 7; count++){
//            System.out.println("Count value is " + count);
//        }

//        count = 1;
//        while(true){
//            if(count == 6) {
//                break;
//            }
//                System.out.println("Count value is :- " + count);
//                count ++;
//            }
//        }

//        count = 6;
//        do{
//            System.out.println("Count value is : ----" + count);
//            count ++;
//            if(count > 50){
//                break;
//            }
//        }while (count !=6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        while(number < finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbers ++;
            if(evenNumbers == 5){
                break;
            }
        }
        System.out.println("Total numbers even found: " + evenNumbers);
//    }
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}

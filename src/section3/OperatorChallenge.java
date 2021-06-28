package section3;

public class OperatorChallenge {
    public static void main(String[] args) {
        double value1 = 20.00d;
        double value2 = 80.00;
        double result = (value1 + value2) * 100.00d;
        System.out.println(value1 + " + " + value2 + " = " + result);

        double theRemainder = result % 40.00d;
        System.out.println("The remainder is :" + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true :  false;
        System.out.println("Is no remainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}

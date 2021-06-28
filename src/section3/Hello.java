package section3;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        String name = "Anne";
        System.out.println("Hello " + name);
        int myFirstNumber = (5 * 2);
        int mySecondNumber = myFirstNumber * 3;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}

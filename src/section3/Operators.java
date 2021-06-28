package section3;

public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 100;
        if(topScore == 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90)||(secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("Tis is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;

    }
}

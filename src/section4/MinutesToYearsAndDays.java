package section4;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        Calculate.printYearsAndDays(561600);
    }
}

class Calculate{
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(minutes + " min = " + (long)(minutes / 60 / 24 / 365)
                    + " y and " + (long)(minutes % (60 * 24 * 365)) / 60 / 24 + " d");
        }
    }
}

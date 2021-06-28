package section4;

public class Decimal {
    public static void main(String[] args) {

        boolean a ;
        a = DecimalComparator.areEqualByThreeDecimalPlaces(0,0);
        System.out.println(a);
    }
}

class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num0, double num1) {
        return ((int) (num0 * 1000)) == ((int) (num1 * 1000));
    }
}
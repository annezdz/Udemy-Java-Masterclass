package section3;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMaxDoubleValue);
        System.out.println(myMinDoubleValue);

        int myValue1 = 5 / 3;
        float myValue2 =  5f / 3f;
        double myValue3 = 5d / 3d;
        System.out.println(myValue1);
        System.out.println(myValue2);
        System.out.println(myValue3);
    }
}

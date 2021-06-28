package section3;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 1000;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(minValue);
        System.out.println("Busted Min Value: " + (minValue - 1));
        System.out.println(maxValue);
        System.out.println("Busted Max Value: " + (maxValue + 1));

        byte minValueByte = Byte.MIN_VALUE;
        byte maxValueByte = Byte.MAX_VALUE;
        System.out.println(minValueByte);
        System.out.println(maxValueByte);
        
        long myValueLong = 1000L;
        

        short minValueShort = Short.MIN_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        System.out.println(minValueShort);
        System.out.println(maxValueShort);

        long minValueLong = Long.MIN_VALUE;
        long maxValueLong = Long.MAX_VALUE;
        System.out.println(minValueLong);
        System.out.println(maxValueLong);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        byte myNewByteValue =(byte) (minValueByte/2);
        short myNewShortValue = (short) (minValueShort/3);

    }
}

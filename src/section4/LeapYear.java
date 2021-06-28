package section4;

public class LeapYear {
    public static void main(String[] args) {
        boolean a = LeapYearCalc.isLeapYear(2400);
        System.out.println(a);
    }
}

class LeapYearCalc{

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999 && year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            return true;
        }
        return false;
    }
}

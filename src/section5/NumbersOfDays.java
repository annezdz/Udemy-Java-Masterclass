package section5;

public class NumbersOfDays {
    public static void main(String[] args) {
        System.out.println(NumbersOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumbersOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumbersOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumbersOfDaysInMonth.isLeapYear(2000));
        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(2,2018));


    }
}
class NumbersOfDaysInMonth{
    public static boolean isLeapYear(int year){
        return (year > 0 || year < 10000) && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 && month > 12 && year > 0 && year < 10000){
            return -1;
        }
        switch (month){
            case 2 :
                return isLeapYear(year) ? 29 : 28;

            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                return 31;

            default :
                return 30;
        }

    }
}

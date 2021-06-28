package section5;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {

        DayOfTheWeek.printDayOfTheWeek(2);
        DayOfTheWeek.printDayOfTheWeekWithIf(10);
    }
}

class DayOfTheWeek {
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day ");
                break;
        }

    }

    public static void printDayOfTheWeekWithIf(int day) {
        if (day == 1) System.out.println("Sunday");
        if (day == 2) System.out.println("Monday");
        if (day == 3) System.out.println("Tuesday");
        if (day == 4) System.out.println("Wednesday");
        if (day == 5) System.out.println("Thursday");
        if (day == 6) System.out.println("Friday");
        if (day == 7) System.out.println("Saturday");
        if(day < 1 || day > 7) System.out.println("Invalid day");
    }
}

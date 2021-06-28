package section4;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        var teste = SecondsMinutes.getDurationString(70,60);
        System.out.println(teste);
        System.out.println(SecondsMinutes.getDurationString(3945));
    }
}

class SecondsMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes > -1 || (seconds >= 0 && seconds <= 59)) {
            var hours = (int) minutes / 60;
            minutes = minutes % 60;

            return hours + " h " + minutes + " m " + seconds + " s ";
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds > -1) {
            int minutes = (int) seconds / 60;
            int restSeconds = seconds % 60;
            System.out.println(seconds + " seconds is " + minutes + " minutes and " + restSeconds + " seconds");
            return getDurationString(minutes, seconds);

        } else {
            return "Invalid value";
        }
    }
}

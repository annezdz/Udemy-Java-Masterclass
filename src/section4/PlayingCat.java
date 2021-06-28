package section4;

public class PlayingCat {
    public static void main(String[] args) {

        System.out.println(Cats.isCatPlayng(true,10));
        System.out.println(Cats.isCatPlayng(false,36));
        System.out.println(Cats.isCatPlayng(false,35));


    }
}

class Cats{

    public static boolean isCatPlayng(boolean summer,int nameTemperature){
        return (!summer || (nameTemperature <= -35)) && (!summer && (nameTemperature > 24 && nameTemperature < 36));

    }
}

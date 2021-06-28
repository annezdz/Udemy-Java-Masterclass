package section4;

public class BarkingDog {

    public static void main(String[] args) {
        boolean pushy = BarkingDogMethod.shouldWakeUp(true,-1);
        System.out.println(pushy);
    }
}

class BarkingDogMethod{

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay >= 0 && hourOfDay <= 23){
            if (isBarking && hourOfDay > 8 && hourOfDay < 22){
                return  true;
            }else{
                return  false;
            }
        }
        return false;
    }
//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        return barking && hourOfDay >= 0 && hourOfDay < 8 || barking && hourOfDay > 22 && hourOfDay < 24;
//    }

}



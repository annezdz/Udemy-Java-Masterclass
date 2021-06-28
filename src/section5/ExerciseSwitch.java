package section5;

public class ExerciseSwitch {
    public static void main(String[] args) {
        char value = 'g';
        switch (value){

            case 'a': case 'b' : case 'c': case 'd': case 'e':
                System.out.println("This char is valid: -> " + value);
                break;
            default:
                System.out.println("Its a invalid parameter");
        }
    }
}

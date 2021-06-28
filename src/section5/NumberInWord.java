package section5;

public class NumberInWord {
    public static void main(String[] args) {
        NumberInWordMethod.printNumberInWord(-1);
        NumberInWordMethod.printNumberInWord(1);
        NumberInWordMethod.printNumberInWord(2);
        NumberInWordMethod.printNumberInWord(3);
        NumberInWordMethod.printNumberInWord(4);
        NumberInWordMethod.printNumberInWord(5);
        NumberInWordMethod.printNumberInWord(6);
        NumberInWordMethod.printNumberInWord(7);
        NumberInWordMethod.printNumberInWord(8);
        NumberInWordMethod.printNumberInWord(9);

    }
}
class NumberInWordMethod{
    public static void printNumberInWord(int number){
        switch (number){
            case 0 :
                System.out.println("Zero");
                break;
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("Five");
                break;
            case 6 :
                System.out.println("Six");
                break;
            case 7 :
                System.out.println("Seven");
                break;
            case 8 :
                System.out.println("Eight");
                break;
            case 9 :
                System.out.println("Nine");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}

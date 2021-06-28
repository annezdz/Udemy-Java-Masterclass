package section4;

public class Equality {
    public static void main(String[] args) {

        EqualityPrinter.printEqual(1,1,1);
        EqualityPrinter.printEqual(1,2,1);
        EqualityPrinter.printEqual(-1,-1,-1);
        EqualityPrinter.printEqual(1,2,3);

    }
}

class EqualityPrinter{
    public static void printEqual(int a , int b , int c){
        if(a < 0 || b < 0 || c < 0){
            System.out.println("Invalid value");
        }
        else if( a == b && b == c && a == c){
            System.out.println("All numbers are equal");
        }
        else if(a != b && b != c && a != c){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}

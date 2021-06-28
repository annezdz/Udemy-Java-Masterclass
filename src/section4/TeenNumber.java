package section4;

public class TeenNumber {
    public static void main(String[] args) {

        boolean resposta = TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(resposta);
        boolean resposta6 = TeenNumberChecker.hasTeen(0,0,20);
        System.out.println(resposta + "-");
        boolean resposta1 = TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(resposta1);
        boolean resposta2 = TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(resposta2);
        boolean resposta4 = TeenNumberChecker.isTeen(9);
        System.out.println(resposta4);
        boolean resposta5 = TeenNumberChecker.isTeen(13);
        System.out.println(resposta5);
    }
}

class TeenNumberChecker{

    public static boolean hasTeen(int a, int b , int c){
        return isTeen(a) || isTeen(b) ||  isTeen(c);
    }

    public static boolean isTeen(int a){
        return a > 12 && a < 20;
    }
}


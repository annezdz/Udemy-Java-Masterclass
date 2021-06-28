package section4;

public class EqualSum {

    public static void main(String[] args) {
        boolean teste = EqualSumChecker.hasEqualSum(1,1,1);
        boolean teste1 = EqualSumChecker.hasEqualSum(1,1,2);
        boolean teste3 = EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(teste);
        System.out.println(teste1);
        System.out.println(teste3);




    }
}

class EqualSumChecker{
    public static boolean hasEqualSum(int a, int b, int c){
        if(Integer.sum(a,b) == c){
            return true;
        }
        return false;
    }
}
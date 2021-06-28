package section4;

public class MegaBytesConverter {
    public static void main(String[] args) {


         Converter.printMegaBytesAndKiloBytes(5000);

    }

}
class Converter{

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        System.out.println(kiloBytes < 0 ? "Invalid Value" :
                kiloBytes + " KB = " + Math.floorDiv(kiloBytes , 1024) + " MB and " + Math.floor(kiloBytes % 1024) + " KB");
    }
}

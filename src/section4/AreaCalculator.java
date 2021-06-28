package section4;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(Area.getArea(5.0));
        System.out.println(Area.getArea(-1.0));
        System.out.println(Area.getArea(5.0,4.0));
        System.out.println(Area.getArea(-1.0,4.0));

    }
}

class Area {

    public static double getArea(double radius) {
        double PI = 3.14;
        double area = 0.0d;
        return radius < 0 ? -1.0 : (area = PI * (Math.pow(radius,2.0)));
    }


    public static double getArea(double x , double y){
    double area = 0.0;
       return x < 0 || y < 0 ? -1.0 : (area = x * y);
    }
}

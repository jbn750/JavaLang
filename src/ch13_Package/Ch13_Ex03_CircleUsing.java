package ch13_Package;

public class Ch13_Ex03_CircleUsing {
    public static void main(String[] args) {
        ch13_Package.com.company.area.Ch13_Circle c1
                = new ch13_Package.com.company.area.Ch13_Circle(3.5);
        System.out.println("반지름 3.5 원 넓이: " + c1.getArea());

        ch13_Package.com.company.circumference.Ch13_Circle c2
                = new ch13_Package.com.company.circumference.Ch13_Circle(3.5);
        System.out.println("반지름 3.5 원 둘레: " + c2.getCircumference());
    }
}

package ch13_Package.com.company.circumference;

public class Ch13_Circle {
    double rad;
    final double PI;

    public Ch13_Circle(double r){
        rad = r;
        PI = 3.14;
    }

    // 원의 넓이 반환
    public double getCircumference() {
        return (rad * 2) * PI;
    }
}

package ch22_InnerClass;

interface Unit9 {
    int cal(int a, int b); // 매개변수 둘, 반환형 int
}

public class Ch22_Ex09_LambdaRule3 {
    public static void main(String[] args) {
        Unit9 unit;
        unit = (a , b) -> { return a + b; };
        // unit = a, b -> { return a + b; }; // 앞쪽 소괄호 생략 안 됨
        // unit = (a, b) -> return a + b; // 뒤쪽 중괄호 생략 안 됨
        int num = unit.cal(10, 20);
        System.out.println(num);

        unit = (a, b) -> a * b; // 뒤쪽 중괄호와 return문 생략 가능
        System.out.println(unit.cal(10, 20));
    }
}

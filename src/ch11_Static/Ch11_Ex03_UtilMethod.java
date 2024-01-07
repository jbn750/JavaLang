package ch11_Static;

public class Ch11_Ex03_UtilMethod {
    public static void main(String[] args) {
        Ch11_MyCalculator calc1 = new Ch11_MyCalculator(); // 객체 생성 후 사용
        int num1 = calc1.adder(1, 2);
        System.out.println(num1);

        int num2 = Ch11_MyCalculator.adder(2, 3); // 새로운 객체를 생성하지 않고 사용
        System.out.println(num2);
    }
}

package ch03_Variable;

public class Ch03_Ex03_TypeChange2 {
    public static void main(String[] args) {
        int num1 = 2147483647;
        // int num2 = 2147483648; // 자료형 크기 에러
        // long num3 = 2147483648; // 자료형 타입 테러
        long num4 = 2147483648L;

        // float num5 = 1.0; // 자료형 타입 에러
        float num6 = 1.0F;
        double num7 = 30; // int -> double 자동 형변환
    }
}

package ch03_Variable;

public class Ch03_Ex02_TypeChange1 {
    public static void main(String[] args) {
        int num1 = 1;
        byte num2 = 1;
        byte num3 = 127;
        //byte num4 = 128; // 범위보다 큰 값을 넣으면 에러

        short num5 = 1;

        //num2 = num5; // 형변환 에러
        num2 = (byte)num5;
    }
}

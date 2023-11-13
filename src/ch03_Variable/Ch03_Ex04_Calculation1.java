package ch03_Variable;

public class Ch03_Ex04_Calculation1 {
    public static void main(String[] args) {
        byte num11 = 1;
        byte num12 = 2;
        // byte num11 + num12; // 에러

        short num13 = 1;
        short num14 = 2;
        // short result1 = num11 + num12; // 에러

        short result2 = (short)(num13 + num14); // 강제 형변환
    }
}

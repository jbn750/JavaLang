package ch04_Operator;

public class Ch04_Ex04_PrefixPostfix {
    public static void main(String[] args) {
        int num = 10; // 변수 선언
        System.out.println(++num); // num값 하나 증가 후 출력
        System.out.println(num); // num값이 증가되어 있음

        System.out.println(num++); // 출력 후에 값이 증가
        System.out.println(num); // 9행에서 증가된 값 확인
    }
}

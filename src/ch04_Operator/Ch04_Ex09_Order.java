package ch04_Operator;

public class Ch04_Ex09_Order {
    public static void main(String[] args) {
        System.out.println(); // println()을 이용한 줄바꿈
        System.out.print("\n"); // 특수 문자를 이용한 줄바꿈
        System.out.println("---------------------");

        int num = 5;

        System.out.println(num + '\n'); // 기본 자료형 끼리는 산술 연산
        System.out.println("---------------------");
        System.out.print(num + "\n");

        System.out.println("3 >= 2 : " + (3 >= 2));
        // System.out.println("3 >= 2 : " + 3 >= 2); // 비교 오류
    }
}

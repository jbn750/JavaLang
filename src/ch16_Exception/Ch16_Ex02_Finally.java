package ch16_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch16_Ex02_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt(); // 에러 발생 지점
            int num2 = 10 / num1; // 에러 발생 지점
            System.out.println(num2);
        } catch (ArithmeticException e) { // 예외 처리
            String str = e.getMessage();
            System.out.println(str);
            if (str.equals("/ by zero")){
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } catch (InputMismatchException e) { // 예외 처리
            System.out.println(e.getMessage());
            // e.printStackTrace();
        } finally {
            System.out.println("Good bye");
        }
    }
}

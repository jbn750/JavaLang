package ch16_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch16_Ex04_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt(); // 에러 발생 지점
            int num2 = 10 / num1; // 에러 발생 지점
            System.out.println(num2);
        } catch (Exception e) {
            System.out.println("예외 발생");
        }
        System.out.println("Good bye");
    }
}

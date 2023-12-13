package ch08_Calculator;

import java.util.Scanner;

public class ch08_Calculator_Ver2 {
    public static void main(String[] args) {
        int menuNumber = 1;
        int num1 = 0;
        int num2 = 0;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.더하기");
            System.out.println("2.빼기");
            System.out.println("3.곱하기");
            System.out.println("4.나누기");
            System.out.println("0.끝내기");

            try {
                menuNumber = scan.nextInt();

                if(1 <= menuNumber && menuNumber <= 4){
                    System.out.print("첫 번째 숫자:");
                    num1 = scan.nextInt();
                    System.out.print("두 번째 숫자:");
                    num2 = scan.nextInt();

                    if(menuNumber == 1){
                        addCal(num1, num2);
                    }else if(menuNumber == 2){
                        subCal(num1, num2);
                    }else if(menuNumber == 3){
                        mulCal(num1, num2);
                    }else if(menuNumber == 4){
                        divCal(num1, num2);
                    }
                }else if(menuNumber == 0){
                    break;
                }else{
                    System.out.println("메뉴를 다시 선택해주세요.");
                }
            }catch(Exception e) {
                System.out.println("메뉴를 다시 선택해주세요.");
                scan.nextLine();
                continue;
            }

        }
    }

    public static void addCal(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subCal(int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void mulCal(int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divCal(int num1, int num2){
        if(num2 == 0){
            System.out.println("0으로는 나눌 수 없습니다.");
            return;
        }
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}

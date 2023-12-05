package ch06_ControlStatement;

public class Ch06_Ex05_For {
    public static void main(String[] args) {

        for(int i = 2 ; i < 10 ; i++){
            System.out.print((2 * i ) + " ");
        }
        System.out.println();

        // 한 줄만 실행하면 중괄호 생략 가능
        for(int i = 2 ; i < 10 ; i++)
            System.out.print((3 * i ) + " "); // 구구단 3단 출력
        System.out.println();

        for(int i = 2 ; i < 10 ; i++) System.out.print((4 * i ) + " ");
            // 구구단 4단 출력
        System.out.println();
    }
}

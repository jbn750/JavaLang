package ch06_ControlStatement;

public class Ch06_Ex04_SwitchString {
    public static void main(String[] args) {

        String name = "임정빈";

        switch(name) { // 조건식
            case "임정빈":
                System.out.println("제 이름은 임정빈입니다.");
            case "홍길동":
                System.out.println("제 이름은 홍길동입니다.");
            default:
                System.out.println("같은 이름이 없습니다.");
        }
    }
}

package ch03_Variable;

public class Ch03_Ex01_FinalUse {
    public static void main(String[] args) {

        //선언과 동시에 초기화
        final int MAX_NUM = 100;
        //선언만
        final int MIN_NUM;

        //나중에 초기화. 딱 한 번 가능
        MIN_NUM = 60;

        int myScore = 40;

        //상수를 사용하면 가독성이 좋아진다.
        if(myScore < MIN_NUM){
            System.out.println("당신의 등급은 F입니다");
        }

    }
}

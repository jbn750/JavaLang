package ch12_Inheritance;

abstract class Unit3 { // 부모 클래스
    abstract void doMove(); // 추상 클래스
}

class Marine3 extends Unit3 { // 자식 클래스
    void doMove() { // 추상 클래스 구현
        System.out.println("마린은 두 발로 이동한다.");
    }
}

class Zergling extends Unit3 {
    void doMove() {
        System.out.println("저글링은 네 발로 이동한다.");
    }
}
public class Ch12_Ex03_MyStarcraft {
    public static void main(String[] args) {
        Marine3 unit1 = new Marine3();
        unit1.doMove();

        Zergling unit2 = new Zergling();
        unit2.doMove();
    }
}

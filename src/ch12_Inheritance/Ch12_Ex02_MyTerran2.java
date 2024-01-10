package ch12_Inheritance;

class Unit2{ // 부모 클래스
    String name;
    int hp;

    void doMove(){ // 메서드 정의
        System.out.println("이동속도 10으로 이동");
    }
}

class Marine2 extends Unit2 { // 자식클래스
    int attack;

    void doMove(){ // 부모 메서드와 같은 이름의 자식 메서드
        super.doMove(); // 부모 메서드 호출
        System.out.println(attack + " 공격");
    }
}

class Medic2 extends Unit2 { // 자식클래스
    int heal;

    void doMove(){ // 부모 메서드와 같은 이름의 자식 메서드
        System.out.println("이동속도 8으로 이동");
        System.out.println(heal + " 치유");
    }
}
public class Ch12_Ex02_MyTerran2 {
    public static void main(String[] args) {
        Marine2 unit1 = new Marine2();
        unit1.name = "마린";
        unit1.hp = 100;
        unit1.attack = 20;

        Medic2 unit2 = new Medic2();
        unit2.name = "메딕";
        unit2.hp = 120;
        unit2.heal = 10;

        unit1.doMove();
        System.out.println();
        unit2.doMove();
    }
}

package ch12_Inheritance;

class Unit{ // 부모 클래스
    String name;
    int hp;

    void printUnit(){
        System.out.println("이름: " + name);
        System.out.println("Hp: " + hp);
    }
}

class Marine extends Unit { // 자식클래스
    int attack; // 멤버 변수

    void printMarine() {
        printUnit();
        System.out.println("공격력: " + attack);
    }
}

class Medic extends Unit { // 자식클래스
    int heal;

    void printMedic() {
        printUnit();
        System.out.println("치유량: " + heal);
    }
}
public class Ch12_Ex01_MyTerran {
    public static void main(String[] args) {
        Marine unit1 = new Marine();
        unit1.name = "마린";
        unit1.hp = 100;
        unit1.attack = 20;

        Medic unit2 = new Medic();
        unit2.name = "메딕";
        unit2.hp = 120;
        unit2.heal = 10;

        unit1.printMarine();
        System.out.println();
        unit2.printMedic();
    }
}

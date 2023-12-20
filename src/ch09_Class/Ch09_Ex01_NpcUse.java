package ch09_Class;

class Npc{

    String name;
    int hp;

    void say(){
        System.out.println("안녕하세요.");
    }
}

public class Ch09_Ex01_NpcUse {
    public static void main(String[] args) {
        // 클래스를 이용해서 객체 생성
        // - 'Npc'라는 설계도(클래스)를 이용해 Npc 객체 생성
        // 클래스 타입의 참조 변수는 스택에, 생성된 객체는 힙에 적재됨
        Npc saram1 = new Npc();
        // 필드 접근
        saram1.name = "경비"; // 멤버 변수에 직접 접근
        saram1.hp = 100; // 멤버 변수에 직접 접근

        System.out.println(saram1.name + ":" + saram1.hp);

        saram1.say();
    }
}

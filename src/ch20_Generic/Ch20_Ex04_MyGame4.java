package ch20_Generic;

class Npc4 {
    public String toString() {
        return "This is a Npc4.";
    }
}

class Tank4 {
    public String toString() {
        return "This is a Tank4.";
    }
}

class Camp4 {
    private Object unit;

    public void set(Object unit){
        this.unit = unit;
    }

    public Object get(){
        return unit;
    }
}

public class Ch20_Ex04_MyGame4 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp4 human = new Camp4();
        Camp4 machine = new Camp4();

        // 게임 종족에 유닛을 생성해 담기
        // 만든 유닛을 넣어야 하는데 스트링 객체가 넣어짐
        human.set("공룡"); // human.set(new String("공룡"));
        machine.set("우주인");

        System.out.println(human.get());
        System.out.println(machine.get());
    }
}

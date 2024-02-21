package ch20_Generic;

class Npc3 {
    public String toString() {
        return "This is a Npc3.";
    }
}

class Tank3 {
    public String toString() {
        return "This is a Tank3.";
    }
}

class Camp3 {
    private Object unit;

    public void set(Object unit){
        this.unit = unit;
    }

    public Object get(){
        return unit;
    }
}

public class Ch20_Ex03_MyGame3 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp3 human = new Camp3();
        Camp3 machine = new Camp3();

        // 게임 종족에 유닛을 생성해 담기
        // 만든 유닛을 넣어야 하는데 스트링 객체가 넣어짐
        human.set("공룡"); // human.set(new String("공룡"));
        machine.set("우주인");

        // 게임 종족에서 유닛 가져오기
        Npc3 hUnit = (Npc3)human.get();
        Tank3 mUnit = (Tank3)machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}

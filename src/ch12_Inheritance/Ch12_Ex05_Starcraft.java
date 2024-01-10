package ch12_Inheritance;

abstract class Building{ // 건물의 기본 설계도
    int health;
    abstract void doBuild();
}

interface Fly { // 건물이 날 수 있는 기능 구현. 건물의 일반적인 기능이 아님
    void flyBuilding();
}

class Barracks extends Building implements Fly{ // 인간형 유닛을 생산하는 건물. 여차하면 날아서 이동 가능
    void doBuild(){
        System.out.println("인간형 유닛 생산 건물을 짓는다.");
    }

    void doMakeMarine(){
        System.out.println("마린을 생산한다.");
    }

    public void flyBuilding(){ // 모든 건물이 날면 안 되므로 인터페이스로 나는 기능 제공
        System.out.println("건물이 날아서 이동하게 한다.");
    }
}

class Factory extends Building implements Fly{ // 기갑형 유닛을 생산하는 건물. 여차하면 날아서 이동 가능
    void doBuild(){
        System.out.println("기갑형 유닛 생산 건물을 짓는다.");
    }

    void doMakeTank(){
        System.out.println("탱크 유닛을 생산한다.");
    }

    public void flyBuilding(){ // 모든 건물이 날면 안 되므로 인터페이스로 나는 기능 제공
        System.out.println("건물이 날아서 이동하게 한다.");
    }
}

class Bunker extends Building{ // 날면 안됨
    void doBuild(){
        System.out.println("인간형 유닛이 숨을 건물을 짓는다.");
    }

    void doDefense(){
        System.out.println("숨을 유닛을 적의 공격으로부터 보호한다.");
    }
}
public class Ch12_Ex05_Starcraft {
    public static void main(String[] args) {
        Barracks barracks = new Barracks();
        barracks.doBuild();
        barracks.doMakeMarine();
        barracks.flyBuilding();

        Factory factory = new Factory();
        factory.doBuild();
        factory.doMakeTank();
        factory.flyBuilding();

        Bunker bunker = new Bunker();
        bunker.doBuild();
        bunker.doDefense();
    }
}

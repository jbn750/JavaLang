package ch18_Enum;

interface Unit6{
    @Deprecated
    public void move(String str);
    public void run(String str);
}

class Human6 implements Unit6{

    @Override
    @SuppressWarnings("deprecation")
    public void move(String str) {
        System.out.println(str);
    }

    @Override
    public void run(String str) {
        System.out.println(str);
    }
}

public class Ch18_Ex06_SuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Unit6 unit = new Human6();
        unit.move("인간형 유닛으로 이동한다.");
        unit.run("인간형 유닛으로 달린다.");
    }
}

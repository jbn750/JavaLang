package ch22_InnerClass;

class HumanCamp2 {
    private int speed = 10;

    public void getMarine() {
        class Marine2 {
            // 외부 클래스의 자원(speed) 사용 가능
            public void move() {
                System.out.printf("인간형 유닛이 %d속도로 이동한다.\n", speed);
            }
        }

        Marine2 inner = new Marine2();
        inner.move();
    }
}


public class Ch22_Ex02_LocalInner {
    public static void main(String[] args) {
        HumanCamp2 hc = new HumanCamp2();
        hc.getMarine();
    }
}

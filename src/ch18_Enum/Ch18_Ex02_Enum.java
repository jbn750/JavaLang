package ch18_Enum;

enum Human2 { MAN, WOMAN }

enum Machine2 { TANK, AIRPLANE }
public class Ch18_Ex02_Enum {
    public static void main(String[] args) {
        createUnit(Machine2.TANK); // 알맞은 상수 사용

        // createUnit(Human2.MAN); // 잘못된 상수 사용 : 에러
    }

    public static void createUnit(Machine2 kind){
        switch(kind) {
            case TANK:
                System.out.println("탱크를 만듭니다.");
                break;
            case AIRPLANE:
                System.out.println("비행기를 만듭니다.");
                break;
        }
    }
}

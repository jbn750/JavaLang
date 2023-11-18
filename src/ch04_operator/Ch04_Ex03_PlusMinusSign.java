package ch04_operator;

public class Ch04_Ex03_PlusMinusSign {
    public static void main(String[] args) {
        short num1 = 5;
        System.out.println(+num1); // 결과에 불필요한 + 연산
        System.out.println(-num1); // 부호를 바꿔서 얻은 결과 출력
        System.out.println(num1); // num1값은 변하지 않음

        short num2 = 7;
        short num3 = (short)(+num2); // 형변환 하지 않으면 오류 발생
        short num4 = (short)(-num2);
        System.out.println(num3);
        System.out.println(num4);

    }
}

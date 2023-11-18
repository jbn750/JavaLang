package ch04_Operator;

public class Ch04_Ex02_Assignment {
    public static void main(String[] args) {
        short num = 10;
        num += 77L; // 사람의 강제 형변환 필요하지 않음
        System.out.println(num);

        num = (short)(num + 77L); // 형변환 필요
        System.out.println(num);
    }
}

package ch05_InputAndOutput;

import java.sql.SQLOutput;

public class Ch05_Ex01_printf {
    public static void main(String[] args) {
        String name = "Lim Jung Bin";
        int age = 20;
        double height = 173.5;

        System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name, age, height);

        System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.\n", name, age, height);
    }
}

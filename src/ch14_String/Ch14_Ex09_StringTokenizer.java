package ch14_String;

import java.util.StringTokenizer;

public class Ch14_Ex09_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("a b c"); // 공백 기준 분할

        while (st1.hasMoreTokens()) { // 토큰 유무 확인
            System.out.println(st1.nextToken());
        }
    }
}

package ch21_CollectionFramework;

import java.util.HashMap;

public class Ch21_Ex14_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Key-Value 기반 데이터 저장
        map.put("홍길동", "010-1234-1234");
        map.put("전우치", "010-4567-4567");
        map.put("손오공", "010-6543-6543");

        // 데이터 탐색
        System.out.println("홍길동: " + map.get("홍길동"));
        System.out.println("전우치: " + map.get("전우치"));
        System.out.println("손오공: " + map.get("손오공"));
        System.out.println();

        // 데이터 삭제
        map.remove("손오공");

        // 데이터 삭재 확인
        System.out.println("손오공: " + map.get("손오공"));
    }
}

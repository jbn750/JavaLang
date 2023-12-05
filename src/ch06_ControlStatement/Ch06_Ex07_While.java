package ch06_ControlStatement;

public class Ch06_Ex07_While {
    public static void main(String[] args) {

        int num = 0;
        int count = 0;

        while((num++) < 100){
            if((num % 5) != 0 )
                continue;  // 5의 배수가 아니면 위로 이동
            if((num % 7) != 0 )
                continue;  // 7의 배수가 아니면 위로 이동

            count++; // 5와 7의 배수면 실행
            System.out.println(num); // 5와 7의 배수면 실행
        }

        System.out.println("count : " + count);
    }
}

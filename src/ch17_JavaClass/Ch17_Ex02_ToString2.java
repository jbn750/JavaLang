package ch17_JavaClass;

class Book3{
    String author;
}
public class Ch17_Ex02_ToString2 {
    public static void main(String[] args) {
        Book3 myBook = new Book3();
        myBook.author = "홍길동";
        System.out.println(myBook.author); // 참조 변수의 멤버 변수의 값 출력
        System.out.println(myBook); // 객체 자체 출력
    }
}

package ch17_JavaClass;

class Book4{
    String author;

    public String toString() { // 메서드 오버라이딩
        return author;
    }
}
public class Ch17_Ex03_ToString3 {
    public static void main(String[] args) {
        Book4 myBook = new Book4();
        myBook.author = "홍길동";
        System.out.println(myBook.author);
        System.out.println(myBook);
    }
}

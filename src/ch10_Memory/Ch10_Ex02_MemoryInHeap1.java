package ch10_Memory;

public class Ch10_Ex02_MemoryInHeap1 {
    public static void main(String[] args) {
        Ch10_Book book1 = new Ch10_Book();
        Ch10_Book book2 = new Ch10_Book();

        book1.num = 10;
        book2.num = 20;

        System.out.println(book1.num);
        System.out.println(book2.num);

        book1 = null;
        book2 = null;
    }

}

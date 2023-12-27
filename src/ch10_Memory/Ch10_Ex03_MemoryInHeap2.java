package ch10_Memory;

public class Ch10_Ex03_MemoryInHeap2 {
    public static void main(String[] args) {
        Ch10_Book book1 = new Ch10_Book();
        book1.num = 10;

        Ch10_Book book2 = book1;

        System.out.println("book1.num : " + book1.num);
        System.out.println("book2.num : " + book2.num);
        System.out.println("-------------------------");

        book2.num = 20;
        System.out.println("book1.num : " + book1.num);
        System.out.println("book2.num : " + book2.num);
    }
}

package ch13_Package;

public class Ch13_Ex02_PackageUse {
    public static void main(String[] args) {
        Ch13_Apple apple = new Ch13_Apple();
        apple.showName();

        // Ch13_Banana banana = new Ch13_Banana();
        ch13_Package.com.study.Ch13_Banana banana = new ch13_Package.com.study.Ch13_Banana();
        banana.showName();
    }
}

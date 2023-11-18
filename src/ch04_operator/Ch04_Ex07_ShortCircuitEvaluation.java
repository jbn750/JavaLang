package ch04_operator;

public class Ch04_Ex07_ShortCircuitEvaluation {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        boolean result;

        result = ((x = x + 1) < 0) && ((y = y+ 1) > 0);

        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        result = ((x = x + 1) > 0) || ((y = y+ 1) > 0);

        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

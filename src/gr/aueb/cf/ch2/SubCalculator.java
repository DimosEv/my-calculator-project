package gr.aueb.cf.ch2;

public class SubCalculator {

    public static void subtract() {
        int num1 = 10;
        int num2 = 5;
        int result = num1 - num2;

        System.out.println("Sub: " + result);
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}

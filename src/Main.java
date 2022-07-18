public class Main {
    public static void main(String[] args) {
        System.out.println(Multiplication(777, 8888));
        long b = sum(1_500_000_000,1_500_000_000);
        System.out.println(b);
        devide(350, 40.5);
    }
    public static int Multiplication(int number1, int number2) {
        return number1 * number2;
    }
    public static void devide(int c, double v) {
        if (v == 0) {
            println1("inf");
        }
        System.out.println(c/v);
    }

        public static long sum(int number1, int number2) {
            return (long) number1 +number2;
        }
    static void println(int number) {
        System.out.println(number);
    }
    static void println1(String text) {
        System.out.println(text);
    }
}
public class RecursiveNumber{
    public static void printNumbers(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        } else {
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        printNumbers(1, 5);
    }
}

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n = ");
        double n = Double.parseDouble(sc.nextLine());
        System.out.print("Введите p = ");
        int p;
        try {
            p = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            p = 2;
        }
        if (p < 2) {
            p = 2;
        }
        System.out.println(n + "^" + p + " = " + power(n, p));
        System.out.println(n + "^" + p + " = " + power((short) n, p));
        System.out.println(n + "^" + p + " = " + power((int) n, p));
        System.out.println(n + "^" + p + " = " + power((long) n, p));
        System.out.println(n + "^" + p + " = " + power((float) n, p));
    }


    private static double power(double n, int p) {
        double res = 1;
        for (int i = 0; i < p; i++) {
            res *= n;
        }
        return res;
    }


    private static short power(short n, int p) {
        short res = 1;
        for (int i = 0; i < p; i++) {
            res *= n;
        }
        return res;
    }

    private static int power(int n, int p) {
        int res = 1;
        for (int i = 0; i < p; i++) {
            res *= n;
        }
        return res;
    }


    private static long power(long n, int p) {
        long res = 1;
        for (int i = 0; i < p; i++) {
            res *= n;
        }
        return res;
    }


    private static float power(float n, int p) {
        float res = 1;
        for (int i = 0; i < p; i++) {
            res *= n;
        }
        return res;
    }
}


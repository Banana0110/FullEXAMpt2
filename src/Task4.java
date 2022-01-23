import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Введите количество домов = ");
                int n = Integer.parseInt(sc.nextLine());
                if (n <= 1) {
                    System.out.println("Количество домов должно быть хотя бы 2");
                    throw new Exception();
                }
                int[] arr = new int[n];
                System.out.println("\nВведите число жителей каждого дома");
                for (int i = 0; i < n; i++) {
                    System.out.print("[" + i + "] = ");
                    arr[i] = Integer.parseInt(sc.nextLine());
                }
                int left = 0;
                int right = 0;
                for (int i = 0; i < n; i++) {
                    if ((i + 1) % 2 == 0) {
                        left += arr[i];
                    } else {
                        right += arr[i];
                    }
                }
                if (left > right) {
                    System.out.println("\n На левой стороне улицы живут больше жителей");
                } else {
                    System.out.println("\nНа правой стороне улицы живут больше жителей");
                }
                System.out.println();
                break;
            } catch (Exception ex) {
                System.out.println("Ошибка!\n");
            }
        } while (true);
    }
}

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Введите размер массива = ");
                int n = Integer.parseInt(sc.nextLine());
                if (n <= 1) {
                    System.out.println("Размер массива должен содержать хотя бы 2 элемента");
                    throw new Exception();
                }
                char[] arr = new char[n];
                System.out.println("\nВведите элементы массива: ");
                for (int i = 0; i < n; i++) {
                    System.out.print("[" + i + "] = ");
                    arr[i] = sc.nextLine().charAt(0);
                }
                System.out.print("\nИсходный массив: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }

                for (int i = 0, j = n - 1; i < j; i++, j--) {
                    char t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

                System.out.println("\n\nИзмененный: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
                break;
            } catch (Exception ex) {
                System.out.println("Ошибка ввода\n");
            }
        } while (true);
    }
}


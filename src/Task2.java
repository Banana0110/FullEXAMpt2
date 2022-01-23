import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Введите 5-значное число = ");
                String str = sc.nextLine();
                if (str.length() == 5) {
                    Integer.parseInt(str);
                    int i = 0, j = str.length() - 1;

                    while (i < j && str.charAt(i) == str.charAt(j)) {
                        i++;
                        j--;
                    }
                    if (i >= j) {
                        System.out.println("Число является палиндромом");
                    } else {
                        System.out.println("Число не является палиндромом");
                    }
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println("Ошибка ввода\n");
            }
        } while (true);
    }
}


import java.util.Scanner;

public class lecture3_cpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Введите число X: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("Пара: индексы [" + i + ", " + j + "] (" + arr[i] + " + " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Пары не найдены.");

        System.out.println("\nВведите 2 числа:");
        System.out.println("Сумма = " + sum(sc.nextInt(), sc.nextInt()));

        System.out.println("Введите 3 числа:");
        System.out.println("Сумма = " + sum(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        System.out.println("Введите 4 числа:");
        System.out.println("Сумма = " + sum(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    static int sum(int a, int b) { return a + b; }
    static int sum(int a, int b, int c) { return a + b + c; }
    static int sum(int a, int b, int c, int d) { return a + b + c + d; }
}


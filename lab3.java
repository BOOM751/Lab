import java.util.Scanner;
import java.util.Random;

public class lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива (n): ");
        int n = input.nextInt();

        int[] array = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(51);
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Массив чисел:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Количество чётных чисел: " + evenCount);
        System.out.println("Количество нечётных чисел: " + oddCount);

    }
}

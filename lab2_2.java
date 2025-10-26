import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Введите " + n + " целых чисел:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        long positiveSum = 0;
        int positiveCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            }
        }
        System.out.println("Исходный массив: ");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Количество положительных чисел: " + positiveCount);

        if (positiveCount > 0) {
            double average = (double) positiveSum / positiveCount;

            System.out.println("Сумма положительных чисел: " + positiveSum);
            System.out.printf("Среднее арифметическое положительных чисел: %.2f\n", average);
        } else {
            System.out.println("В массиве нет положительных чисел.");
        }
    }
}

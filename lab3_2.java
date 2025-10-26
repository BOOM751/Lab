import java.util.Random;

public class lab3_2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101) - 50;
        }

        System.out.println("Сгенерированный массив:");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        System.out.println("\nСумма положительных чисел: " + sumPositive(arr));
        System.out.println("Произведение отрицательных чисел: " + multiplyNegative(arr));
        System.out.println("Количество нулей: " + countZeros(arr));
    }

    public static int sumPositive(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int multiplyNegative(int[] arr) {
        int product = 1;
        boolean hasNegative = false;
        for (int num : arr) {
            if (num < 0) {
                product *= num;
                hasNegative = true;
            }
        }
        return hasNegative ? product : 0;
    }

    public static int countZeros(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
}


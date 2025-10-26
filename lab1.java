import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = input.nextInt();

        System.out.println("Введите второе число:");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Сумма чисел: " + sum);
    }
}

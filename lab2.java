import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = input.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("чётное");
        }
        else
        {
            System.out.println("нечётное");
        }
    }
}

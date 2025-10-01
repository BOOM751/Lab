import java.util.Scanner;

public class Var1 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = dd.nextInt();
        System.out.print("Введите второе число: ");
        int b = dd.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("НОД = " + a);
    }
}


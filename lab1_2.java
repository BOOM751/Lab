import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Введите строку:");
        String name = scanner.nextLine();
        String reversed = new StringBuffer(name).reverse().toString();

        System.out.println("Строка наоборот:" + reversed);
    }
}

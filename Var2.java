import java.util.Scanner;

public class Var2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] queue = new String[5];
        int size = 0;

        while (true) {
            System.out.println("Команды: add, remove, show, exit");
            String command = in.nextLine();

            if (command.equals("add")) {
                if (size == queue.length) {
                    System.out.println("Очередь полная!");
                } else {
                    System.out.print("Введите имя: ");
                    String name = in.nextLine();
                    queue[size] = name;
                    size++;
                    System.out.println(name + " добавлен в очередь.");
                }
            } else if (command.equals("remove")) {
                if (size == 0) {
                    System.out.println("Очередь пустая!");
                } else {
                    System.out.println(queue[0] + " удалён из очереди.");
                    for (int i = 0; i < size - 1; i++) {
                        queue[i] = queue[i + 1];
                    }
                    queue[size - 1] = null;
                    size--;
                }
            } else if (command.equals("show")) {
                if (size == 0) {
                    System.out.println("Очередь пустая!");
                } else {
                    System.out.print("Очередь: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(queue[i] + " ");
                    }
                    System.out.println();
                }
            } else if (command.equals("exit")) {
                System.out.println("Выход");
                break;
            }
        }
    }
}

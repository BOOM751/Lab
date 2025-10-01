abstract class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
    public abstract void introduce();
}

class Developer extends Employee implements Trainable {
    String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " пишет код на " + programmingLanguage + ".");
    }

    @Override
    public void introduce() {
        System.out.println("Я разработчик " + name + ", зарплата: " + salary +
                ", язык: " + programmingLanguage);
    }

    @Override
    public void attendTraining() {
        System.out.println(name + " проходит обучение по " + programmingLanguage + ".");
    }
}

class Manager extends Employee implements Reportable {
    int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " управляет командой из " + teamSize + " человек.");
    }

    @Override
    public void introduce() {
        System.out.println("Я менеджер " + name + ", зарплата: " + salary +
                ", команда: " + teamSize + " человек.");
    }

    @Override
    public void generateReport() {
        System.out.println(name + " подготовил отчет для руководства.");
    }
}

interface Reportable {
    void generateReport();
}

interface Trainable {
    void attendTraining();
}

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Алихан", 500000, "Java");
        Employee manager = new Manager("Арман", 700000, 5);

        Employee[] employees = {dev, manager};

        for (Employee emp : employees) {
            emp.introduce();
            emp.work();
            System.out.println();
        }

        if (dev instanceof Trainable) {
            ((Trainable) dev).attendTraining();
        }

        if (manager instanceof Reportable) {
            ((Reportable) manager).generateReport();
        }
    }
}

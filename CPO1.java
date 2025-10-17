import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int age;

    // Конструктор
    public Student(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Ошибка: студенту " + name + " меньше 18 лет!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (" + age + " лет)";
    }
}

class School {
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(String name, int age) {
        try {
            Student s = new Student(name, age);
            students.add(s);
            System.out.println("Студент " + name + " успешно добавлен.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            System.out.println("\nСписок студентов:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}

public class CPO1 {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent("Арман", 20);
        school.addStudent("Диана", 17); // Ошибка — слишком молодой
        school.addStudent("Айжан", 19);
        school.addStudent("Бекзат", 16); // Ошибка
        school.addStudent("Камила", 21);

        school.showStudents();
    }
}

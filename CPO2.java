import java.util.*;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class LowGradeException extends Exception {
    public LowGradeException(String message) {
        super(message);
    }
}

public class CPO2 {
    public static void findGrade(Map<String, Integer> grades, String student)
            throws StudentNotFoundException, LowGradeException {

        if (!grades.containsKey(student)) {
            throw new StudentNotFoundException("Студент " + student + " не найден.");
        }

        int grade = grades.get(student);

        if (grade < 50) {
            throw new LowGradeException("Оценка студента " + student + " слишком низкая: " + grade);
        }

        System.out.println(student + " имеет хорошую оценку: " + grade);
    }

    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("Арман", 85);
        grades.put("Айжан", 45);
        grades.put("Данияр", 70);

        String[] students = {"Арман", "Айжан", "Бекзат", "Данияр"};
        for (int i = 0; i < students.length; i++) {
            String student = students[i];
            try {
                findGrade(grades, student);
            }
            catch (StudentNotFoundException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            catch (LowGradeException e) {
                System.out.println("Предупреждение: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Неизвестная ошибка: " + e.getMessage());
            }
        }
    }
}

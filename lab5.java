//вариант10
import java.util.*;

public class lab5 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Лев");
        animals.add("Тигр");
        animals.add("Слон");
        animals.add("Лиса");
        animals.add("Лошадь");
        animals.add("Заяц");
        animals.add("Енот");
        animals.add("Корова");
        animals.add("Овца");
        animals.add("Олень");
        animals.add("Кошка");
        animals.add("Собака");
        animals.add("Медведь");
        animals.add("Волк");
        animals.add("Барс");
        animals.add("Гепард");
        animals.add("Обезьяна");
        animals.add("Собака");
        animals.add("Попугай");
        animals.add("Верблюд");

        //Сортировка жасап дубликаттарды алып тастайды
        TreeSet<String> uniqueAnimals = new TreeSet<String>(animals);

        System.out.println("Первые 10 уникальных животных (лексикографически)");
        int count = 0;
        for (String animal : uniqueAnimals) {
            System.out.println(animal);
            count++;
            if (count == 10) break;
        }

        //Бірінші әріптері бойынша топқа бөледі
        Map<Character, List<String>> groups = new TreeMap<Character, List<String>>();

        for (String animal : uniqueAnimals) {
            char firstLetter = animal.charAt(0); //Бірінші әріп
            if (!groups.containsKey(firstLetter)) {
                groups.put(firstLetter, new ArrayList<String>());
            }
            //Топқа кіргізеді
            groups.get(firstLetter).add(animal);
        }


        //Осы әріптен басталатын жануарлар екеуден көп болса көрсетеді
        System.out.println("\n Буквы, у которых количество животных больше 2 ");
        for (Map.Entry<Character, List<String>> entry : groups.entrySet()) {
            List<String> list = entry.getValue();
            if (list.size() > 2) {
                System.out.println(entry.getKey() + ": " + list);
            }
        }
        //Топты көрсетеді
        System.out.println("\n Все группы животных ");
        for (Map.Entry<Character, List<String>> entry : groups.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int m = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = createRandomList(n, m);
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Прошло фильтр " + filteredList.size() + " элемента из " + n);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);
        logger.log("Завершаем программу");
    }

    private static List<Integer> createRandomList(int size, int maxValue) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (list.size() < size) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }
}

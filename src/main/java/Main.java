import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int len = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int max = scanner.nextInt();
        logger.log("Создаём и наполняем список: ");
        List<Integer> list = new ArrayList<>();
        int simvol;
        System.out.print("Вот случайный список: ");
        for(int i = 0; i < len; i++){
            simvol = random.nextInt(max);
            System.out.print(simvol + " ");
            list.add(simvol);
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра:");
        int limit = scanner.nextInt();
        Filter filter = new Filter(limit);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        result.forEach(x -> System.out.print(x + " "));
        System.out.println();
        logger.log("Завершаем программу");
    }
}

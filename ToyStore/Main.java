import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore(); // Создание экземпляра ToyStore
        store.put("1 2 конструктор"); // Добавление игрушек в магазин
        store.put("2 2 робот");
        store.put("3 6 кукла");

        List<String> results = new ArrayList<>(); // Список для хранения извлеченных id игрушек
        for (int i = 0; i < 10; i++) {
            results.add(store.get()); // Извлечение и добавление id игрушек 10 раз
        }

        try {
            // Запись извлеченных id игрушек в файл с именем "results.txt"
            Files.write(
                    Paths.get("ToyStore//results.txt"),
                    results,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            e.printStackTrace(); // Вывод информации об ошибке записи файла, если она произошла
        }
    }
}
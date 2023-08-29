import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<String> idList = new ArrayList<>(); // Список для хранения id игрушек
    private List<String> nameList = new ArrayList<>(); // Список для хранения имён игрушек
    private List<Integer> frequencyList = new ArrayList<>(); // Список для хранения частот игрушек
    private PriorityQueue<String> toyQueue = new PriorityQueue<>(
            Comparator.comparingInt(id -> frequencyList.get(idList.indexOf(id)))
    ); // Приоритетная очередь для управления выбором игрушек на основе частоты

    // Метод для добавления новой игрушки в магазин
    public void put(String input) {
        String[] parts = input.split(" ");
        Toy toy = new Toy(parts[0], parts[2], parts[1]); // Создание нового объекта Toy
        idList.add(toy.getId()); // Добавление id в список idList
        nameList.add(toy.getName()); // Добавление имени в список nameList
        frequencyList.add(toy.getFrequency()); // Добавление частоты в список frequencyList

        // Добавление id игрушки в очередь несколько раз на основе её частоты
        for (int i = 0; i < toy.getFrequency(); i++) {
            toyQueue.offer(toy.getId());
        }
    }

    // Метод для получения случайного id игрушки из магазина
    public String get() {
        String randomToyId = toyQueue.poll(); // Извлечение и удаление id игрушки с наивысшим приоритетом
        refillQueueIfEmpty(); // Пополнение очереди, если она стала пустой
        return randomToyId; // Возврат извлеченного id игрушки
    }

    // Метод для пополнения очереди, если она пуста
    private void refillQueueIfEmpty() {
        if (toyQueue.isEmpty()) {
            // Перебор id игрушек и их частот для пополнения очереди
            for (int i = 0; i < idList.size(); i++) {
                String id = idList.get(i);
                for (int j = 0; j < frequencyList.get(i); j++) {
                    toyQueue.offer(id);
                }
            }
        }
    }
}
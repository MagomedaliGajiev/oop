public class Toy {
    private String id;
    private String name;
    private int frequency;

    // Конструктор класса Toy, принимающий id, имя и частоту в качестве параметров
    public Toy(String id, String name, String frequency) {
        this.id = id;
        this.name = name;
        this.frequency = Integer.parseInt(frequency); // Преобразование частоты из строки в целое число
    }

    // Метод-геттер для получения id игрушки
    public String getId() {
        return id;
    }

    // Метод-геттер для получения имени игрушки
    public String getName() {
        return name;
    }

    // Метод-геттер для получения частоты игрушки
    public int getFrequency() {
        return frequency;
    }
}
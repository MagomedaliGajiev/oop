package decorator.factory.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        // ICalculableFactory calculableFactory = new CalculableFactory();
        // CalculatorView view = new CalculatorView(calculableFactory);
        // view.run();

        ICalculableFactory calculableFactory1 = new CalculableFactoryWithLogger();
        CalculatorView view1 = new CalculatorView(calculableFactory1);
        view1.run();
    }
}

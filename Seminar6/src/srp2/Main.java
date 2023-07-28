package srp2;

import srp2.model.ConsoleViewer;
import srp2.model.JsonSaver;
import srp2.model.Order;
import srp2.model.Saver;
import srp2.model.TxtSaver;

public class Main {
    public static void main(String[] args) {
        ConsoleViewer consoleViewer = new ConsoleViewer();
        Order order = consoleViewer.inputFromConsole();
        Saver jsonSaver = new JsonSaver(order);
        jsonSaver.save();
        Saver txtSaver = new TxtSaver(order);
        txtSaver.save();
    }
}

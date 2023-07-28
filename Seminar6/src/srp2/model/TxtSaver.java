package srp2.model;

import java.io.FileWriter;

public class TxtSaver implements Saver {

    Order order;

    public TxtSaver(Order order) {
        this.order = order;
    }

    @Override
    public void save() {
        String fileName = "order.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(order.getClientName() + ",");
            writer.write(order.getClientName() + ",");
            writer.write(order.getQuantity() + ",");
            writer.write(order.getPrice() + ".");
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

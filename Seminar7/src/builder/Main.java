package builder;

import builder.item.Characteristic;
import builder.item.impl.Laptop;

public class Main {
    public static void main(String[] args) {
        
        Characteristic characteristic = Characteristic.builder()
            .brand("Apple")
            .color("Red")
            .ram("256")
            .build();

        Laptop laptop = new Laptop(characteristic);
    }
}

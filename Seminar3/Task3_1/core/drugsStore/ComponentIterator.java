package Seminar3.Task3_1.core.drugsStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    List<Component> components = new ArrayList<>();
    int componentsCount = 0;


    public boolean hasNext() {
        return this.componentsCount < this.components.size();
    }

    public Component next() {
        return this.components.get(this.componentsCount++);
    }
}

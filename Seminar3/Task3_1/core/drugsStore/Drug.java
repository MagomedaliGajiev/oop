package Seminar3.Task3_1.core.drugsStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Drug implements Iterable<Component>, Comparable<Drug>  {
    protected List<Component> components;
    protected int componentsCount;

    public Drug() {
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }

    public Drug addComponent(Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "components=" + components +
                ", componentCounts=" + componentsCount +
                '}'+"Total power = " + getPowerTotal(this) + "\n";
    }

    @Override
    public Iterator<Component> iterator() {
        // return new Iterator<Component>(){  // Анонимный класс
        //     public boolean hasNext(){
        //         return componentsCount < components.size();
        //     }

        //     public Component next(){
        //     return components.get(componentsCount++);
        //     }
        // };

        return new ComponentIterator();
    
    }

    @Override
    public int compareTo(Drug o) {
        int power1 = getPowerTotal(this);
        int power2 = getPowerTotal(o);
        return Integer.compare(power1, power2);
        // if (power1 > power2) {
        //     return 1;
        // }
        // else if (power1 < power2) {
        //     return -1;
        // } else {
        //     return 0;
        // }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Drug))
            return false;
        Drug other = (Drug) obj;

        ArrayList<Component> tmpThis = new ArrayList<>(components);
        ArrayList<Component> tmpOther = new ArrayList<>(other.components);
        Collections.sort(tmpThis);
        Collections.sort(tmpOther);
        return tmpThis.equals(tmpOther);
    }

    private int getPowerTotal(Drug drug){
        int result = 0;
        for (Component item : drug.getComponents() ) {
            result += item.getPower();
        }

        return result;
    }
}

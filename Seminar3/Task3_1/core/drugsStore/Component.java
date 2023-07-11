package Seminar3.Task3_1.core.drugsStore;

public class Component implements Comparable<Component> {
    protected String name;
    protected String weight;
    protected int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString(){
        return "Component{" +
        "name='" + name + '\'' +
        ", weight='" + weight + '\'' +
        ", power=" + power +
        '}';
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this)
            return true;
        if (!(obj instanceof Component))
            return false;
        Component other = (Component) obj;
        return (name.equals(other.name) && weight.equals(other.weight) && weight == other.weight);
    }

    @Override
    public int compareTo(Component o) {
        if (this.name.compareTo(o.name) != 0){
            return this.name.compareTo(o.name);
        } else {
            if (this.weight.compareTo(o.weight) != 0){
                return this.weight.compareTo(o.weight);
            } else {
                return Integer.compare(this.power, o.power);
            }
        }
    }
}

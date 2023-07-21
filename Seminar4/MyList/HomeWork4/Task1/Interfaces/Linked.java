package Seminar4.MyList.HomeWork4.Task1.Interfaces;

public interface Linked<T> {
    void addLast(T t);
    void addFirst(T t);
    int size();
    T getElementByIndex(int index);
}

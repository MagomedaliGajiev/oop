package Seminar4.MyList.HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import Seminar4.MyList.GBList;
import Seminar4.MyList.HomeWork4.Task1.ArrayIterator;

public class GBArrayList<E> implements GBList<E> {

    private E[] values;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(E t) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = t;
            return true;
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int AmountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, AmountElementsAfterIndex);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @SuppressWarnings("unchecked")
    @Override
    public GBList<E> join(E t) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = t;
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    @Override
    public String toString() {
        return "GBArrayList{" +
        "values=" + Arrays.toString(values) +
        '}';

    }

}

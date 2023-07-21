package Seminar4.MyList.HomeWork4.Task1;

import java.util.Iterator;

import Seminar4.MyList.HomeWork4.Task1.Interfaces.DescendingItereator;
import Seminar4.MyList.HomeWork4.Task1.Interfaces.Linked;

public class LinkedConteiner<T> implements Linked<T>, Iterable<T>, DescendingItereator<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public LinkedConteiner() {
        lastNode = new Node<T>(null, firstNode, null);
        firstNode = new Node<T>(null, null, lastNode);
    }

    private class Node<T> {
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;

        private Node(T currentElement, Node<T> prevElment, Node<T> nextElement) {
            this.currentElement = currentElement;
            this.prevElement = prevElment;
            this.nextElement = nextElement;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<T> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<T> prevElement) {
            this.prevElement = prevElement;
        }

    }

    @Override
    public void addLast(T t) {
        Node<T> prev = lastNode;
        prev.setCurrentElement(t);
        lastNode = new Node<T>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(T t) {
        Node<T> next = firstNode;
        next.setCurrentElement(t);
        firstNode = new Node<T>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int index) {
        Node<T> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<T> getNextElement(Node<T> current) {
        return current.getNextElement();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return getElementByIndex(index++);
            }
        }; 
    }

    @Override
    public Iterator<T> descendingItereator() {
        return new Iterator<T>() {
            int index = size - 1;
            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public T next() {
                return getElementByIndex(index--);
            }
        }; 
    }



}

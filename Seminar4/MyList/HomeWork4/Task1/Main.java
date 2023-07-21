package Seminar4.MyList.HomeWork4.Task1;

import java.util.Iterator;

import Seminar4.MyList.HomeWork4.Task1.Interfaces.Linked;

public class Main {
    public static void main(String[] args) {
        LinkedConteiner<String> myLinked = new LinkedConteiner<>();
        myLinked.addFirst("sdsd");
        myLinked.addLast("abc");
        myLinked.addFirst("Magomedali");
        myLinked.addLast("Gajiev");
        System.out.println(myLinked.getElementByIndex(1));

        for (String s : myLinked) {
            System.out.println(s);
        }

        System.out.println("=============================================");

        Iterator iterator = myLinked.descendingItereator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

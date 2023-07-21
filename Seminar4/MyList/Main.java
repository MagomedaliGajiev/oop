package Seminar4.MyList;

import Seminar4.MyList.HomeWork4.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList<Number> gbList = new GBArrayList<>();
        gbList.add(77);
        gbList.add(88);
        gbList.add(880);
        gbList.add(69);
        gbList.add(99);
        gbList.add(21);
        gbList.join(21).join(33).join(27);


        System.out.println(gbList);
        System.out.println(gbList.size());
        gbList.remove(5);
        System.out.println(gbList.size());
        System.out.println(gbList.get(4));
        gbList.update(0, 4554.55656f);
        System.out.println(gbList);
        gbList.get(77);

    }
}

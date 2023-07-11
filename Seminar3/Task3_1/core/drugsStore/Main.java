package Seminar3.Task3_1.core.drugsStore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        Drug drug1 = new Drug();
        Component comp1 = new Component("Penicilin", "10 mg", 10);
        Component comp2 = new Component("Alcohol", "100 mg", 1000);
        drug1.addComponent(comp1).addComponent(comp2);

        // while (((Iterator<Component>) drug1).hasNext()) {
        //     System.out.println(drug1.next());
        // }

        // System.out.println(drug1);

        // DogDrug dogDrug = new DogDrug();

        // for (Component item : drug1) {
        //     System.out.println(item);
        //     System.out.println("ghgj");
        // }

        Drug drug2 = new Drug();
        Component comp3 = new Component("Penicilin", "10 mg", 10);
        Component comp4 = new Component("Alcohol", "100 mg", 1000);
        drug2.addComponent(comp3).addComponent(comp4);

        Drug drug3 = new Drug();
        Component comp5 = new Component("Penicilin", "10 mg", 77);
        Component comp6 = new Component("Alcohol", "100 mg", 88);
        Component comp7 = new Component("Alcohol", "15 mg", 800);

        drug3.addComponent(comp5).addComponent(comp6).addComponent(comp7);

        Drug drug4 = new Drug();
        Component comp8 = new Component("Penicilin", "10 mg", 10);
        Component comp9 = new Component("Alcohol", "100 mg", 1001);

        drug4.addComponent(comp8).addComponent(comp9);


        // System.out.println(drug1.toString());
        // for (Component elem : drug1) {
        //     System.out.println(elem);
        // }

        List<Drug> myList = new ArrayList<>();
        myList.add(drug3);
        myList.add(drug2);
        myList.add(drug1);
        myList.add(drug4);

        // System.out.println(myList);

        // Collections.sort(myList);

        // System.out.println();

        System.out.println(myList);
        System.out.println(myList.size());

        System.out.println("===================================================================");
        Set<Drug> set = new TreeSet<Drug>(myList);
        for (Drug drug : set){
            System.out.println(drug.toString());
        }

        System.out.println(set.size());
    }
}

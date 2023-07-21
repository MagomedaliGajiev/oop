package Seminar4.MyList.HomeWork4.Task2;

import java.io.IOException;
import java.time.LocalDate;

import Seminar2.Task2_1.core.clients.Animal;
import Seminar2.Task2_1.core.clients.home.impl.Dog;
import Seminar2.Task2_1.core.clients.owners.Owner;
import Seminar2.Task2_1.core.clients.wild.impl.WildCat;

import Seminar4.MyList.HomeWork4.Task2.utill.DBCreator;

public class Main {
    public static void main(String[] args) {
        WildCat wildCat = new WildCat(1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));
 
        createDB(wildCat);
}

   


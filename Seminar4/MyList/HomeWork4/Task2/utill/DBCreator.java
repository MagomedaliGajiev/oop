package Seminar4.MyList.HomeWork4.Task2.utill;

import java.io.File;

import Seminar2.Task2_1.core.clients.Animal;

public class DBCreator<T extends Animal > {
    private final String DB_PATH = "Seminar4\\MyList\\HomeWork4\\Task2\\database\\";

    public  void createDB(T t) {
        String fileName = t.getCLASS_NAME() + ".txt";
        try {
            File db = new File(DB_PATH + fileName);
            if (db.createNewFile()) {
                System.out.println("DB created");
            }
            else {
                System.out.println("DB already exists");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}

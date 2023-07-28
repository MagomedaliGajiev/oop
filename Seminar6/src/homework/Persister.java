package homework;

public class Persister{
    public Persister(){};

    public void save(Entity object){
        System.out.println("Object saved into table " + object.getTableName());
    } 
}

package homework;

public class User implements Reportable, Entity{
    private final String name;
    private final double balance;

    public User(String name){
        this.name = name;
        this.balance = 0;
    }

    public String getName(){
        return name;
    }

    @Override
    public String getReportInfo() {
        return String.format("User @%s\nBalance: %f", name, balance);
    }

    @Override
    public String getTableName() {
        return "users";
    }
}

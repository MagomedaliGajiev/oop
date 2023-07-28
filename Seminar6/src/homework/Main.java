package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        ReportService reportService = new ReportService();
        Persister persister = new Persister();

        reportService.report(user);
        persister.save(user);
    }
}
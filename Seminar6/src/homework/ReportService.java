package homework;

public class ReportService {
    public void report(Reportable reportable){
        String reportInfo = reportable.getReportInfo();
        System.out.println(reportInfo);
    }
}

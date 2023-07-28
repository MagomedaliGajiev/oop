package dip1.model;

import java.util.List;

public class ReportManager {
    Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void output(List<ReportItem> ReportItems) {
        reportable.output(ReportItems);
    }
}

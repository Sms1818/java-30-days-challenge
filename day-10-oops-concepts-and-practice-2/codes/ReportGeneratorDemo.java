/*
Problem

Design a Report Generator System.

Your application needs to generate reports in different formats:

PDFReport
ExcelReport
CSVReport
Common flow

For every report, the process is:

loadData()
formatData()
export()
Rules
loadData() should be common for all reports and print:
Loading data...
formatData() should be different for each report type:
PDF → Formatting data for PDF
Excel → Formatting data for Excel
CSV → Formatting data for CSV
export() should also be different:
PDF → Exporting PDF report
Excel → Exporting Excel report
CSV → Exporting CSV report
Requirement

Create a design where the client can do:

Report report = new PDFReport();
report.generateReport();

and similarly for the others.
*/

// Solution: My intuition is to use an abstract class Report which will have a common method loadData() and two abstract methods formatData() and export() which will be implemented by the classes PDFReport, ExcelReport and CSVReport. The generateReport() method will be final in the Report class to ensure that the flow of generating a report is consistent across all report types, while allowing the specific formatting and exporting logic to be defined in the subclasses. In the main method, we will create objects of each report type and call the generateReport() method to see the output for each report type.

/*This is the Template Method Pattern.

Meaning:

parent defines the algorithm structure
child classes fill in the variable steps
*/
// Output
// Loading data...
// Formatting data for PDF
// Exporting PDF report
// Loading data...
// Formatting data for Excel
// Exporting Excel report
// Loading data...
// Formatting data for CSV
// Exporting CSV report
abstract class Report{
    public void loadData(){
        System.out.println("Loading data...");
    }
    public abstract void formatData();
    public abstract void export();
    public final void generateReport(){
        loadData();
        formatData();
        export();
    }
}
class PDFReport extends Report{
    @Override
    public void formatData() {
        System.out.println("Formatting data for PDF");
    }
    @Override
    public void export() {
        System.out.println("Exporting PDF report");
    }
}
class ExcelReport extends Report{
    @Override
    public void formatData() {
        System.out.println("Formatting data for Excel");
    }
    @Override
    public void export() {
        System.out.println("Exporting Excel report");
    }
}
class CSVReport extends Report{
    @Override
    public void formatData() {
        System.out.println("Formatting data for CSV");
    }
    @Override
    public void export() {
        System.out.println("Exporting CSV report");
    }
}

public class ReportGeneratorDemo {
    public static void main(String[] args) {
        Report pdfReport = new PDFReport();
        pdfReport.generateReport();

        Report excelReport = new ExcelReport();
        excelReport.generateReport();

        Report csvReport = new CSVReport();
        csvReport.generateReport();
    }
}

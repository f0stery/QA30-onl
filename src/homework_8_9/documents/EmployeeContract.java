package homework_8_9.documents;

import java.util.Date;

public class EmployeeContract extends Document {
    private final Date contractEndDate;
    private String employeeName;

    protected EmployeeContract(String documentNumber, Date documentDate,
                               Date contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Goods Supply Contract:");
        System.out.println("Number: " + documentNumber);
        System.out.println("Date: " + documentDate);
        System.out.println("End Date: " + contractEndDate);
        System.out.println("Employee: " + employeeName);
    }

    public Date getContractEndDate(){
        return contractEndDate;
    }

    public String getEmployeeName(){
        return employeeName;
    }

}

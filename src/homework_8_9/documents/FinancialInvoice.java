package homework_8_9.documents;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double totalAmount;
    private String departmentCode;

    protected FinancialInvoice(String documentNumber, Date documentDate,
                               double totalAmount, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }


    @Override
    public void displayInfo() {
        System.out.println("Final sum if month: " + totalAmount);
        System.out.println("Date: " + documentDate);
        System.out.println("Number: " + documentNumber);
        System.out.println("Code: " + departmentCode);
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public String getDepartmentCode(){
        return departmentCode;
    }
}

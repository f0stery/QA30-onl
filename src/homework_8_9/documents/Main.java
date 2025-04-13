package homework_8_9.documents;

import homework_8_9.documents.Registry.Registry;

import java.util.Date;

public class Main {
    public static void main(String[] args){

        Registry registry = new Registry();

        Date currentDate = new Date();

        GoodsSupplyContract goodsContract = new GoodsSupplyContract(
                "GC-001",
                currentDate,
                "Electronics",
                100
        );

        Date endDate = new Date(currentDate.getTime() + 365L * 24 * 60 * 60 * 1000);
        EmployeeContract employeeContract = new EmployeeContract(
                "EC-001",
                currentDate,
                endDate,
                "John Doe"
        );

        FinancialInvoice invoice = new FinancialInvoice(
                "FI-001",
                currentDate,
                15000.50,
                "DEP-IT"
        );

        registry.addDocument(goodsContract);
        registry.addDocument(employeeContract);
        registry.addDocument(invoice);

        // Выводим информацию о документах
        System.out.println("\nDisplaying document info:");
        registry.displayDocumentInfo(goodsContract);
        System.out.println();
        registry.displayDocumentInfo(employeeContract);
        System.out.println();
        registry.displayDocumentInfo(invoice);
    }
}

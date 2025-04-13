package homework_8_9.documents;

import homework_8_9.documents.Registry.Registry;
import homework_8_9.documents.exceptions.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Date currentDate = new Date();

        try {
            // 1. Добавляем несколько документов (количество может быть любым)
            registry.addDocument(new GoodsSupplyContract(
                    "555abcGC-0011a2b", currentDate, "Electronics", 100));

            registry.addDocument(new FinancialInvoice(
                    "555abcFI-0011a2b", currentDate, 15000.50, "DEP-IT"));

            registry.addDocument(new EmployeeContract(
                    "555abcEC-0011a2b", currentDate,
                    new Date(currentDate.getTime() + 365L * 24 * 60 * 60 * 1000),
                    "Evgeny"));

        } catch (ABCSequenceException | StartsWith555Exception | EndsWith1a2bException e) {
            System.out.println("Ошибка при добавлении документа: " + e.getMessage());
        }

        // Выводим информацию только о добавленных документах
        System.out.println("\nИнформация о документах в регистре (" + registry.getCount() + "):");
        for (int i = 0; i < registry.getCount(); i++) {
            registry.displayDocumentInfo(registry.getDocument(i));
            System.out.println();
        }
    }
}
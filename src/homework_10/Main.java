package homework_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа (формат: xxxx-yyy-xxxx-yyy-xyxy): ");
        String docNumber = scanner.nextLine();

        if (!docNumber.matches("\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-\\w{4}")) {
            System.out.println("Неверный формат номера документа!");
            return;
        }

        DocumentUtils.printFirstTwoBlocks(docNumber);
        DocumentUtils.maskLetters(docNumber);
        DocumentUtils.extractLetters(docNumber);
        DocumentUtils.extractLettersWithBuilder(docNumber);
        DocumentUtils.checkForABC(docNumber);
        DocumentUtils.checkStartsWith555(docNumber);
        DocumentUtils.checkEndsWith1a2b(docNumber);

        scanner.close();
    }
}

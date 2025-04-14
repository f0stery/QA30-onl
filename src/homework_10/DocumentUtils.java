package homework_10;

public class DocumentUtils {

    public static void printFirstTwoBlocks(String docNumber) {
        String[] blocks = docNumber.split("-");
        if (blocks.length >= 3) {
            System.out.println("Первые два цифровых блока: " + blocks[0] + " " + blocks[2]);
        } else {
            System.out.println("Некорректный формат номера документа");
        }
    }

    public static void maskLetters(String docNumber) {
        String[] blocks = docNumber.split("-");
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].matches("[a-zA-Z]{3}")) {
                blocks[i] = "***";
            }
        }
        System.out.println("Маскированный номер: " + String.join("-", blocks));
    }

    public static void extractLetters(String docNumber) {
        String letters = docNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (letters.length() >= 8) {
            String formatted = String.format("%s/%s/%s/%s",
                    letters.substring(0, 3),
                    letters.substring(3, 6),
                    letters.substring(6, 7),
                    letters.substring(7, 8));
            System.out.println("Буквы документа: " + formatted);
        } else {
            System.out.println("Недостаточно букв в номере документа");
        }
    }

    public static void extractLettersWithBuilder(String docNumber) {
        String letters = docNumber.replaceAll("[^a-zA-Z]", "").toUpperCase();
        if (letters.length() >= 8) {
            StringBuilder sb = new StringBuilder("Letters:");
            sb.append(letters.substring(0, 3)).append("/")
                    .append(letters.substring(3, 6)).append("/")
                    .append(letters.charAt(6)).append("/")
                    .append(letters.charAt(7));
            System.out.println(sb.toString());
        } else {
            System.out.println("Недостаточно букв в номере документа");
        }
    }

    public static void checkForABC(String docNumber) {
        boolean contains = docNumber.toLowerCase().contains("abc");
        System.out.println(contains ? "Документ содержит 'abc'" : "Документ не содержит 'abc'");
    }

    public static void checkStartsWith555(String docNumber) {
        boolean starts = docNumber.startsWith("555");
        System.out.println(starts ? "Документ начинается с '555'" : "Документ не начинается с '555'");
    }

    public static void checkEndsWith1a2b(String docNumber) {
        boolean ends = docNumber.toLowerCase().endsWith("1a2b");
        System.out.println(ends ? "Документ заканчивается на '1a2b'" : "Документ не заканчивается на '1a2b'");
    }
}
package homework_8_9.documents.Registry;

import homework_8_9.documents.Document;

public class Registry {
    private final Document[] documents;
    private int count;

    public Registry() {
        documents = new Document[10];
        count = 0;
    }

    public void addDocument(Document doc) {
        if (count < 10) {
            documents[count] = doc;
            count++;
        } else {
            System.out.println("Registry is full");
        }
    }

    public Document getDocument(int index) {
        return documents[index];
    }

    public int getCount() {
        return count;
    }

    public void displayDocumentInfo(Document doc) {
            doc.displayInfo();
    }
}
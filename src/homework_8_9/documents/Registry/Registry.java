package homework_8_9.documents.Registry;

import homework_8_9.documents.Document;

public class Registry {
    private Document[] documents;
    private int count;

    public Registry() {
        documents = new Document[10];
        count = 0;
    }

    public void addDocument(Document document){
        if (count < 10) {
            documents[count] = document;
            count++;
            System.out.println("Document added to registry");
        } else {
            System.out.println("Registry is FULL. Cannot add more documents");
        }
    }

    public void displayDocumentInfo(Document document){
        document.displayInfo();
    }

    public Document getDocument(int index){
        if (index >= 0 && index < count) {
            return documents[index];
        }
        return null;
    }
}
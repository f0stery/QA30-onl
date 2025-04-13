package homework_8_9.documents;

import java.util.Date;

public abstract class Document {
    protected String documentNumber;
    protected Date documentDate;


    protected Document(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public abstract void displayInfo();

    public String getDocumentNumber() {
        return documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }
}

package homework_8_9.documents;

import java.util.Date;
import homework_8_9.documents.exceptions.*;

public abstract class Document {
    protected String documentNumber;
    protected Date documentDate;


    protected Document(String documentNumber, Date documentDate) throws ABCSequenceException,
            StartsWith555Exception, EndsWith1a2bException {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;

        checkABCSequence();
        checkStartsWith555();
        checkEndsWith1a2b();
    }

    private void checkABCSequence() throws ABCSequenceException {
        if (!documentNumber.contains("abc")) {
            throw new ABCSequenceException("Document number must contain 'abc' sequence. " +
                    "Invalid number: " + documentNumber);
        }
    }

    private void checkStartsWith555() throws StartsWith555Exception {
        if (!documentNumber.startsWith("555")) {
            throw new StartsWith555Exception("Document number must start with '555'. " +
                    "Invalid number: " + documentNumber);
        }
    }

    private void checkEndsWith1a2b() throws EndsWith1a2bException {
        if (!documentNumber.endsWith("1a2b")) {
            throw new EndsWith1a2bException("Document number must end with '1a2b'. " +
                    "Invalid number: " + documentNumber);
        }
    }

    public abstract void displayInfo();

    public String getDocumentNumber() {
        return documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }
}

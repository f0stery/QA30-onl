package homework_8_9.documents;

import homework_8_9.documents.exceptions.ABCSequenceException;
import homework_8_9.documents.exceptions.EndsWith1a2bException;
import homework_8_9.documents.exceptions.StartsWith555Exception;

import java.util.Date;

public class GoodsSupplyContract extends Document {

    private String goodsType;
    private int goodsQuantity;


    protected GoodsSupplyContract(String documentNumber, Date dateDocument,
                                  String goodsType, int goodsQuantity) throws ABCSequenceException,
            StartsWith555Exception, EndsWith1a2bException {
        super(documentNumber, dateDocument);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Goods Supply Contract:");
        System.out.println("Number: " + documentNumber);
        System.out.println("Date: " + documentDate);
        System.out.println("Goods Type: " + goodsType);
        System.out.println("Quantity: " + goodsQuantity);

    }

    public String getGoodsType(){
        return goodsType;
    }

    public int getGoodsQuantity(){
        return goodsQuantity;
    }

}

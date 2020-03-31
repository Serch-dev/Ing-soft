package amazon;

import java.io.Serializable;

public class Item implements Serializable{
    
    private int idItem;
    private String nameItem;
    private String descrptionItem;
    private int priceItem;
    private String iconItem;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getDescrptionItem() {
        return descrptionItem;
    }

    public void setDescrptionItem(String descrptionItem) {
        this.descrptionItem = descrptionItem;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(int priceItem) {
        this.priceItem = priceItem;
    }

    public String getIconItem() {
        return iconItem;
    }

    public void setIconItem(String iconItem) {
        this.iconItem = iconItem;
    }
    
}

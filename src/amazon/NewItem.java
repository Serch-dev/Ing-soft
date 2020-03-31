package amazon;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Vector;
import com.itextpdf.text.Document;
import com.itextpdf.text.ListItem;



public class NewItem {
    
    File fileItem = new File("Item.obj");
    Item objAuxI;
    Vector vectorItem = new Vector();
    
    public void addNewItem(Item objItem){
        
        try{
            
            getData();
            vectorItem.add(objItem);
            
            if(fileItem.exists()){
                fileItem.delete();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileItem));
            oos.writeObject(vectorItem);
            oos.close();
            
            vectorItem.clear();
        }
        catch(Exception ex){}
    }
    
    public void getData(){
        
        try{
            if(fileItem.exists()){
                
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileItem));
                vectorItem = (Vector) ois.readObject(); 
            }
            
        }
        catch(Exception ex){}
        
    }
    
    public Item showItem(Item objItem){
        
        try{

            getData();
            
            for(int i=0; i<vectorItem.size(); i++){
                
                objAuxI = (Item) vectorItem.get(i);
                if(objItem.getIdItem()==objAuxI.getIdItem()){
                    
                    Store.jTextFieldNameItem.setText(objAuxI.getNameItem());
                    Store.jTextFieldDescriptionItem.setText(objAuxI.getDescrptionItem());
                    Store.jTextFieldPriceItem.setText(Integer.toString(objAuxI.getPriceItem()));
                    return objAuxI;
                }
            }
            
            vectorItem.clear();
        }
        catch(Exception ex){}
        
        return null;
    }
    
    public Item showItemStore(Item objItem){
        
        try{

            getData();
            
            for(int i=0; i<vectorItem.size(); i++){
                
                objAuxI = (Item) vectorItem.get(i);
                if(objItem.getNameItem().equals(objAuxI.getNameItem())){
                    
                    Store.jLabelNameItemStore.setText("Name: "+objAuxI.getNameItem());
                    Store.jLabelDescriptionItemStore.setText("Description: "+objAuxI.getDescrptionItem());
                    Store.jLabelPriceItemStore.setText("Price: $"+Integer.toString(objAuxI.getPriceItem()));
                    return objAuxI;
                }
            }
            
            vectorItem.clear();
        }
        catch(Exception ex){}
        
        return null;
    }
    
    public void editItem(Item objItem){
        
        try{

            getData();
            
            for(int i=0; i<vectorItem.size(); i++){
                
                objAuxI = (Item) vectorItem.get(i);
                if(objItem.getIdItem()==objAuxI.getIdItem()){
                    
                    objAuxI.setNameItem(objItem.getNameItem());
                    objAuxI.setDescrptionItem(objItem.getDescrptionItem());
                    objAuxI.setPriceItem(objItem.getPriceItem());
                    objAuxI.setIconItem(objItem.getIconItem());
                }
            }
            
            if(fileItem.exists()){
                fileItem.delete();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileItem));
            oos.writeObject(vectorItem);
            oos.close();
            
            vectorItem.clear();
            
        }
        catch(Exception ex){}
        
    }
    
    public void deleteItem(Item objItem){

        try{

            getData();
            
            for(int i=0; i<vectorItem.size(); i++){
                
                objAuxI = (Item) vectorItem.get(i);
                if(objItem.getIdItem()==(objAuxI.getIdItem())){
                    vectorItem.remove(vectorItem.get(i));
                }
            }
            
            if(fileItem.exists()){
                fileItem.delete();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileItem));
            oos.writeObject(vectorItem);
            oos.close();
            
            vectorItem.clear();
        }
        catch(Exception ex){}
        
    }
    
    public void generatePDF(Item objItem, int noItem)throws Exception{
        
        RandomAccessFile rafMovimiento = null;
        File BuyItem;
        
        ArrayList<String> LisItems = new ArrayList<>();
        
        BuyItem = new File("Movimientos.obj");
        rafMovimiento = new RandomAccessFile(BuyItem, "rw");
        rafMovimiento.seek('\0');
                
        try{
            
            LisItems.add("Name: "+objItem.getNameItem());
            LisItems.add("Description: "+objItem.getDescrptionItem());
            LisItems.add("Price: $"+Integer.toString(objItem.getPriceItem()));
            LisItems.add("No. Items: "+noItem);
            LisItems.add("\r\n");
            
        }
        
        catch(Exception ex){}
        rafMovimiento.close();
        
        FileOutputStream archivo = new FileOutputStream("ListItems.pdf");
        Document doc = new Document();
        
        PdfWriter.getInstance(doc, archivo);
        doc.open();
        
        for (String n : LisItems) {
            doc.add(new Paragraph(n));
        }
        
        doc.close();
        LisItems.clear();
    } 
   
}

package amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class NewAccount {
    
    File file = new File("Account.obj");
    Account objAux;
    Vector vectorAccount = new Vector();
    
    public Account singIn(Account objAccount){
        
        try{
            
            getData();
            
            for(int i=0; i<vectorAccount.size(); i++){
                
                objAux = (Account) vectorAccount.get(i);
                if(objAccount.getUserNameAccount().equals(objAux.getUserNameAccount()) && objAccount.getPasswordAccount().equals(objAux.getPasswordAccount())){
                    return objAux;
                }
            }
        }
        
        catch(Exception ex){}
        return null;
    }
    
    public void addNewAccount(Account objAccount){
        
        try{
            
            getData();
            vectorAccount.add(objAccount);
            
            if(file.exists()){
                file.delete();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(vectorAccount);
            oos.close();
            
            vectorAccount.clear();
        }
        catch(Exception ex){}
    }
    
    public void getData(){
        
        try{
            if(file.exists()){
                
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                vectorAccount = (Vector) ois.readObject(); 
            }
            
        }
        catch(Exception ex){}
        
    }
    
    public void showAccount(Account objAccount){
        
        try{

            getData();
            
            for(int i=0; i<vectorAccount.size(); i++){
                
                objAux = (Account) vectorAccount.get(i);
                if(objAccount.getUserNameAccount().equals(objAux.getUserNameAccount())){
                    
                    Store.jTextFieldNameAccount.setText(objAux.getNameAccount());
                    Store.jTextFieldPhone.setText(objAux.getPhoneAccount());
                    Store.jTextFieldCountryAccount.setText(objAux.getCountryAccount());
                    Store.jTextFieldEmailAccount.setText(objAux.getEmailAccount());
                    Store.jComboBoxTipeAccount.setSelectedIndex(objAux.getTipeAccount());
                }
            }
            
            vectorAccount.clear();
        }
        catch(Exception ex){}
    }
    
    public void editAccount(Account objAccount){
        
        try{

            getData();
            
            for(int i=0; i<vectorAccount.size(); i++){
                
                objAux = (Account) vectorAccount.get(i);
                if(objAccount.getUserNameAccount().equals(objAux.getUserNameAccount())){
                    
                    objAux.setNameAccount(objAccount.getNameAccount());
                    objAux.setPhoneAccount(objAccount.getPhoneAccount());
                    objAux.setCountryAccount(objAccount.getCountryAccount());
                    objAux.setEmailAccount(objAccount.getEmailAccount());
                    objAux.setPasswordAccount(objAccount.getPasswordAccount());
                    objAux.setTipeAccount(objAccount.getTipeAccount());
                }
            }
            
            if(file.exists()){
                file.delete();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(vectorAccount);
            oos.close();
            
            vectorAccount.clear();
            
        }
        catch(Exception ex){}
        
    }
    
    public void deleteAccount(Account objAccount){

        try{

            getData();
            
            for(int i=0; i<vectorAccount.size(); i++){
                
                objAux = (Account) vectorAccount.get(i);
                if(objAccount.getUserNameAccount().equals(objAux.getUserNameAccount())){
                    vectorAccount.remove(vectorAccount.get(i));
                }
            }
            
            if(file.exists()){
                file.delete();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(vectorAccount);
            oos.close();
            
            vectorAccount.clear();
        }
        catch(Exception ex){}
        
    }
    
}

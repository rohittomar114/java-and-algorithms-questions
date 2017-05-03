package basicQuestions;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableExample 
{
    public static void main(String[] args) 
    {
        UserSettings settings = new UserSettings();
        settings.setDoNotStoreMe("Sensitive info");
        settings.setFieldOne(10000);
        settings.setFieldTwo("HowToDoInJava.com");
        settings.setFieldThree(false);
         
        //Before
        System.out.println("---------Passed object of settings-------");
        System.out.println(settings);
        storeUserSettings(settings);
        UserSettings loadedSettings = loadSettings();
        System.out.println(loadedSettings);
    }
     
    static String OUTPUT_FILE_STRING;
    
    private static UserSettings loadSettings() {
    	
    	System.out.println("--------Input Stream---- With Null value for those not serialized------");
        try {
            FileInputStream fis = new FileInputStream("object.ser");
            //FileInputStream fis = new FileInputStream(OUTPUT_FILE_STRING);
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            UserSettings settings =  (UserSettings) ois.readObject();
            ois.close();
            return settings;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
     
    private static void storeUserSettings(UserSettings settings)
    {
    	System.out.println("---------OutputStream-------");
        try {
            FileOutputStream fos = new FileOutputStream("object.ser");
            //FileOutputStream fos = new FileOutputStream(OUTPUT_FILE_STRING);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(settings);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class UserSettings implements Externalizable {
    
    //This is required
    public UserSettings(){
         
    }
 
    private String doNotStoreMe;
 
    private Integer fieldOne;
    private String fieldTwo;
    private boolean fieldThree;
 
    public String getDoNotStoreMe() {
        return doNotStoreMe;
    }
 
    public void setDoNotStoreMe(String doNotStoreMe) {
        this.doNotStoreMe = doNotStoreMe;
    }
 
    public Integer getFieldOne() {
        return fieldOne;
    }
 
    public void setFieldOne(Integer fieldOne) {
        this.fieldOne = fieldOne;
    }
 
    public String getFieldTwo() {
        return fieldTwo;
    }
 
    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }
 
    public boolean isFieldThree() {
        return fieldThree;
    }
 
    public void setFieldThree(boolean fieldThree) {
        this.fieldThree = fieldThree;
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        fieldOne = in.readInt();
        fieldTwo = in.readUTF();
        fieldThree = in.readBoolean();
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(fieldOne);
        out.writeUTF(fieldTwo);
        out.writeBoolean(fieldThree);
    }
 
    @Override
    public String toString() {
        return "UserSettings [doNotStoreMe=" + doNotStoreMe + ", fieldOne="
                + fieldOne + ", fieldTwo=" + fieldTwo + ", fieldThree="
                + fieldThree + "]";
    }	
}

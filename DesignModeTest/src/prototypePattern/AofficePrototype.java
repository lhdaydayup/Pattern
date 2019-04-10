package prototypePattern;

import java.io.*;

public class AofficePrototype implements OfficePrototype {
    @Override
    public void displan() {
        System.out.println("打印报告A");
    }

    public AofficePrototype clone(){
        try {
            Object object=super.clone();
            return (AofficePrototype) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public AofficePrototype deepClone(){
        AofficePrototype officePrototype=null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream inputStream=new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            officePrototype=(AofficePrototype)objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return officePrototype;
    }
}

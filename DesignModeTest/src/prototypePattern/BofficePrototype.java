package prototypePattern;

import java.io.*;

public class BofficePrototype implements OfficePrototype {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void displan() {
        System.out.println("打印报告B");
    }

    public BofficePrototype(){
        address=new Address();
        address.setTown("荆门");
    }

    public BofficePrototype clone(){
        try {
            Object object=super.clone();
            return (BofficePrototype) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public BofficePrototype deepClone(){
        BofficePrototype officePrototype=null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream inputStream=new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            officePrototype=(BofficePrototype)objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return officePrototype;
    }
}

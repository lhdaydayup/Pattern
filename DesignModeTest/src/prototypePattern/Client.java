package prototypePattern;

public class Client {
    public static void main(String[] agrs){
        Customer customer=new Customer();
        Address address=new Address();
        address.setCity("荆州");
        address.setTown("横市");
        customer.setAddress(address);
        customer.setName("李怀");
        Customer cus=customer.clone();
        System.out.println(cus.getAddress().getCity());
        System.out.println(cus.getName());

        System.out.println(cus.getAddress()==customer.getAddress());
        System.out.println(cus==customer);
        PrototypeManager p=PrototypeManager.getInstance();
/*
        OfficePrototype aofficePrototypeA=p.getOfficeProtory("A");
*/
      /*  aofficePrototypeA.displan();
        OfficePrototype aofficePrototypeB=p.getOfficeProtory("B");
        aofficePrototypeB.displan();*/

        /*System.out.println(p.getOfficeProtory("A").clone());*/
        OfficePrototype officePrototype =(OfficePrototype)p.getOfficeProtory("A");
        System.out.println(officePrototype);
        officePrototype.displan();
        Address a=((BofficePrototype)(p.getOfficeProtory("B")).deepClone()).getAddress();
        Address b=((BofficePrototype)p.getOfficeProtory("B").deepClone()).getAddress();
        BofficePrototype e=(BofficePrototype)p.getOfficeProtory("B").clone();
        BofficePrototype f=(BofficePrototype)p.getOfficeProtory("B").clone();
        System.out.println(a);
        System.out.println(e==f);
    }
}

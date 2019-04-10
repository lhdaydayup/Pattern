package prototypePattern;

import java.util.Hashtable;

public class PrototypeManager {
    private  Hashtable hashtable;
    private static class IoDH{
        public final static PrototypeManager manager=new PrototypeManager();
    }
    private PrototypeManager(){
        hashtable=new Hashtable();
        hashtable.put("A",new AofficePrototype());
        hashtable.put("B",new BofficePrototype());
    }

    public  void addOfficeProtory(String key,OfficePrototype prototype){
        hashtable.put(key,prototype);
    }

    public  OfficePrototype getOfficeProtory(String key){
        OfficePrototype officePrototype=(OfficePrototype)hashtable.get(key);
        return officePrototype.clone();
    }

    public static PrototypeManager getInstance (){
        return IoDH.manager;
    }
}

package FlyweightPattern;

import java.util.Hashtable;

public class DocumentFactory {
    public static DocumentFactory documentFactory=new DocumentFactory();
    public static Hashtable hashtable;
    public static DocumentFactory getInstance(){
        return documentFactory;
    }
    public DocumentFactory(){
        hashtable=new Hashtable();
        Document m,p,v;
        m=new Medio("a");
        p=new Picture("b");
        v=new Video("c");
        hashtable.put("a",m);
        hashtable.put("b",p);
        hashtable.put("c",v);
    }

    public Document getDocument(String key){
        return (Document) hashtable.get(key);
    }

    public void addDocument(String key,Document document){
        hashtable.put(key,document);
    }

    public void removeDocument(String key){
        hashtable.remove(key);
    }
}

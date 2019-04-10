package BridgePattern;

public class XmlTrans extends Trans {
   /* public XmlTrans(DataSource data) {
        super(data);
    }*/

    @Override
    public void change() {
        data.getData();
        System.out.println("change to Xml");
    }
}

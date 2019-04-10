package BridgePattern;

public class TxtTrans extends Trans {
  /*  public TxtTrans(DataSource data) {
        super(data);
    }*/

    @Override
    public void change() {
        data.getData();
        System.out.println("change to Txt");
    }
}


package BridgePattern;

public class PdfTrans extends Trans {
   /* public PdfTrans(DataSource data) {
        super(data);
    }*/

    @Override
    public void change() {
        data.getData();
        System.out.println("change to Pdf");
    }
}

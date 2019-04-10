package FlyweightPattern;

public abstract class Document {
    public abstract String getDocumentName();
    //动态。。
    public void setInfo(Position p,Size size){
        System.out.println("文件名为"+this.getDocumentName()+"位置:x:"+p.getX()+"y:"+p.getY()+"大小:weigth:"+size.getWight()+"hight:"+size.getHight());
    }
}

/*
public class Document {
    public  String getDocumentName(){return null;};
    public void setInfo(Position p,Size size){
        System.out.println("文件名为"+this.getDocumentName()+"位置:x:"+p.getX()+"y:"+p.getY()+"大小:weigth:"+size.getWight()+"hight:"+size.getHight());
    }
}
*/


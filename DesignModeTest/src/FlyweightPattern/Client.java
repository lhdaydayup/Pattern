package FlyweightPattern;



public class Client {
    public  static void main(String[] agrs){
        DocumentFactory documentFactory=DocumentFactory.getInstance();
        Document a,b,c,a1;
        a=documentFactory.getDocument("a");
        a1=documentFactory.getDocument("a");
        b=documentFactory.getDocument("b");
        c=documentFactory.getDocument("c");
        Size size=new Size();
        size.setHight("1");
        size.setWight("2");
        Position position=new Position();
        position.setX("50");
        position.setY("80");
        Position position1=new Position();
        position1.setX("20");
        position1.setY("30");
        a.setInfo(position,size);
        a.setInfo(position1,size);
        a1.setInfo(position,size);
        System.out.println(a==a1);

    }
}

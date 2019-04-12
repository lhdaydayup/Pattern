package decoratorPattern.B;


public class Client {
    public static void main(String[] args){
        Decorator a,b,c,e;
        a=new EazyJiaMi();
        b=new OneJiaMi();
        c=new ThreeJiaMi();
        e=new TwoJiaMi();

        b.setComponent(a);
        e.setComponent(b);
        c.setComponent(e);
        c.jiaMi();


    /*    ((EazyJiaMi) a).setComponent(b);
        ((ThreeJiaMi) c).setComponent(a);
        ((TwoJiaMi) e).setComponent(c);
        e.jiaMi();*/
    }


}

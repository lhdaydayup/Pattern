package decoratorPattern;


/*
*装饰者模式
* 添加 新功能
* 与桥接模式不同的几点：1.关联的对象 在装饰者模式中和对象是同一个父类，在桥接模式中不是同一个。  一个是抽象的（桥接模式），一个是不是抽象的
*
* */
public class Client {
    public static void main(String[] args){
        Component a,b,c,e;
         e=new EazyJiaMi();
         a=new OneJiaMi(e);
         b=new TwoJiaMi(a);
         c=new ThreeJiaMi(e);
        b.jiami();
    }
}

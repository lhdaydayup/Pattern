package simpleFactoryPattern.client;

import simpleFactoryPattern.factory.UtilFactory;
import simpleFactoryPattern.product.DrawUtil;


//简单方法工厂
//应用场景：少量类的创建
//缺点：类多了工厂类逻辑会复杂。由于是静态方法无法是的工厂类有继承结构，不利于拓展
//优点：对象的生产和使用
public class Client {
    public static void main(String[] args){
        DrawUtil util=UtilFactory.getUtil("YuanXin");
        util.draw();
        util.erase();
    }
}

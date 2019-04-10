package abstuctFactoryPattern;

import XMLUtil.XMLUtil;
import abstuctFactoryPattern.factory.GameControlloerFactory;

//抽象工厂模式
//应用场景：多个产品族，多个产品等级结构
//缺点：增加新的产品等级结构，改动较大。不符合开闭原则
//优点：增加新的产品族，不用改变原代码。符合开闭原则
public class Client {
    public static void main(String[] args){
        GameControlloerFactory factory=(GameControlloerFactory)XMLUtil.getBean();
        factory.createInterface().inter();
        factory.createOperation().opera();
    }
}

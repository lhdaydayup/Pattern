package factoryMethodPattern.client;

import XMLUtil.XMLUtil;
import factoryMethodPattern.product.ParsePictureUtil;

//工厂方法模式
//优点：符合开闭原则
//缺点：类的个数会增加，增大程序开销
//适用场景：比如海尔冰箱和格力冰箱。不同的厂家。。。。。。
//添加不同的产品只需要添加产品和厂家


public class Client {
    public static void main(String[] args){
        ParsePictureUtil parsePictureUtil=(ParsePictureUtil) XMLUtil.getBean();
        parsePictureUtil.parsePicuter();
    }
}

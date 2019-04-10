package simpleFactoryPattern.product;

public class SanJiaoXinDrawUtil extends DrawUtil {
    @Override
    public void draw() {
        System.out.println("draw SanJiaoXin");
    }

    @Override
    public void erase() {
        System.out.println("erase SanJiaoXin");
    }
}

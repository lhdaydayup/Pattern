package simpleFactoryPattern.product;

public class YuanXinDrawUtil extends DrawUtil {
    @Override
    public void draw() {
        System.out.println("draw YuanXin");
    }

    @Override
    public void erase() {
        System.out.println("erase YuanXin");
    }
}

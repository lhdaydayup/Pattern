package simpleFactoryPattern.product;

public class FangXinDrawUtil extends DrawUtil {
    @Override
    public void draw() {
        System.out.println("draw FangXin");
    }

    @Override
    public void erase() {
        System.out.println("erase FangXin");

    }
}

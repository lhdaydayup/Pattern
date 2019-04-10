package decoratorPattern;

public class ThreeJiaMi extends Decorator {

    public ThreeJiaMi(Component component) {
        super(component);
    }

    @Override
    public void jiami() {
        super.jiami();
        System.out.println("通过C加密方式");
    }
}

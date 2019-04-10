package decoratorPattern;

public class TwoJiaMi extends Decorator {

    public TwoJiaMi(Component component) {
        super(component);
    }

    @Override
    public void jiami() {
        super.jiami();
        System.out.println("通过B加密方式");
    }

}

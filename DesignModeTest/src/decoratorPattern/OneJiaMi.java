package decoratorPattern;

public class OneJiaMi extends Decorator {

    public OneJiaMi(Component component) {
        super(component);
    }

    @Override
    public void jiami() {
        super.jiami();
        System.out.println("通过A加密方式");
    }
}

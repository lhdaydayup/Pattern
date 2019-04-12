package decoratorPattern.B;

public class TwoJiaMi extends Decorator {
    @Override
    public void jiaMi() {
        component.jiaMi();
        System.out.println("通过B加密方式");
    }
}

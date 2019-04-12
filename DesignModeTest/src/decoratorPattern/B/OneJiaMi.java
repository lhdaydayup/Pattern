package decoratorPattern.B;

public class OneJiaMi extends Decorator {
    @Override
    public void jiaMi() {
        component.jiaMi();
        System.out.println("通过A加密方式");
    }
}

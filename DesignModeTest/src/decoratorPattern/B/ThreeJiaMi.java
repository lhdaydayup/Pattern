package decoratorPattern.B;

public class ThreeJiaMi extends Decorator {
    @Override
    public void jiaMi() {
        component.jiaMi();
        System.out.println("通过C加密方式");
    }
}

package decoratorPattern.B;

public abstract class Decorator extends Component{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public abstract void jiaMi();
}

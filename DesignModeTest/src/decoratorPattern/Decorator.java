package decoratorPattern;

public class Decorator extends Component{
    protected Component component;
    public Decorator(Component component){
        this.component=component;
    }
    public void jiami(){
        component.jiami();
    };
}

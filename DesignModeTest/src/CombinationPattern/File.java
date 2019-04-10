package CombinationPattern;

import java.util.ArrayList;
import java.util.List;

public class File extends Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    private List<Component> children= new ArrayList<>();
    @Override
    void operation() {
        for (Component component:children){
            component.operation();
        }
    }

    void addComponent(Component component){
        children.add(component);
    }
    void removeComponent(Component component){
        children.remove(component);
    }

    @Override
    Component getChild(int i) {
        return children.get(i);
    }
}

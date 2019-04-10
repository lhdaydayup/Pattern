package CombinationPattern;

public abstract class Component {
    abstract void operation();
    abstract void addComponent(Component component);
    abstract void removeComponent(Component component);
    abstract Component getChild(int i);
}

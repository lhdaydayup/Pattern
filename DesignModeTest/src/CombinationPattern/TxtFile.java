package CombinationPattern;

public class TxtFile extends Component {
    private String name;

    public TxtFile(String name) {
        this.name = name;
    }

    @Override
    void operation() {
        System.out.println("系统对该"+name+"文本文件进行杀毒");
    }

    @Override
    void addComponent(Component component) {

    }

    @Override
    void removeComponent(Component component) {

    }

    @Override
    Component getChild(int i) {
        return null;
    }
}

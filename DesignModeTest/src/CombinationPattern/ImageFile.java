package CombinationPattern;

public class ImageFile extends Component {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    void operation() {
        System.out.println("系统对该"+name+"图像文件进行杀毒");
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

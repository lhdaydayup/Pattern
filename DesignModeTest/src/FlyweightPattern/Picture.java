package FlyweightPattern;

public class Picture extends Document {
    private String name;

    public Picture(String name) {
        this.name = name;
    }

    @Override
    public String getDocumentName() {
        return "图片-"+name;
    }
}

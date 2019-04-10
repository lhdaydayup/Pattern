package FlyweightPattern;

public class Medio extends Document {
    private String name;

    public Medio(String name) {
        this.name = name;
    }

    @Override
    public String getDocumentName() {
        return "视频-"+name;
    }
}

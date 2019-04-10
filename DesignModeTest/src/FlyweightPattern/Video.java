package FlyweightPattern;

public class Video extends Document {
    private String name;

    public Video(String name) {
        this.name = name;
    }

    @Override
    public String getDocumentName() {
        return "影像-"+name;
    }
}

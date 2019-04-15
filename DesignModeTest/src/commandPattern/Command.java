package commandPattern;

public abstract class Command {
    public abstract int excute(int i);
    public abstract int undo();
    public abstract int redo();
}

package prototypePattern;

public interface OfficePrototype extends Prototype {
    public void displan();
    public OfficePrototype clone();
    public OfficePrototype deepClone();
}

package BridgePattern;

public abstract class Trans {
    protected DataSource data;

    public DataSource getData() {
        return data;
    }

    public void setData(DataSource data) {
        this.data = data;
    }

  /*  public Trans(DataSource data){
        this.data=data;
    }*/
    public abstract void change();
}

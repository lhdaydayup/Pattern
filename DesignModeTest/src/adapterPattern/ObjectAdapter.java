package adapterPattern;

public class ObjectAdapter implements NowUtil{
    private ThirdSystem thirdSystem;
    public ObjectAdapter(ThirdSystem thirdSystem){
        this.thirdSystem=thirdSystem;
    }

    @Override
    public void newJiami() {
        thirdSystem.jiami();
    }
}

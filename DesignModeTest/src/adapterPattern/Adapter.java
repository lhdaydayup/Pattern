package adapterPattern;

public class Adapter extends ThirdSystem implements NowUtil  {
    @Override
    public void newJiami() {
        jiami();
    }
}

package adapterPattern;

public class Client {
    public static void main(String[] agrs){
        new Adapter().newJiami();
        new ObjectAdapter(new ThirdSystem()).newJiami();
    }
}

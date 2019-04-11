package ProxyPattern;

public class Do extends Base {
    @Override
    public void method(){
        System.out.println("执行操作");
        int i=1/0;
    }
}

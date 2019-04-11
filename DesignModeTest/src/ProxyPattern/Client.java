package ProxyPattern;

public class Client {

    public static void main(String[] args){
        Base doo,proxyDo;
        doo=new Do();
        proxyDo=new ProxyDo(doo);
        proxyDo.method();
    }
}

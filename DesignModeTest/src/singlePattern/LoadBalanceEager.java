package singlePattern;

import java.util.ArrayList;
import java.util.List;


//饿汉式单例模式
//优点：解决了多线程出现非单例出现的问题
//缺点：无法做到延迟加载，占用内存资源
public class LoadBalanceEager{
    private final static LoadBalanceEager loadBalanceEager=new LoadBalanceEager();
    private List<String> serverList;
    private LoadBalanceEager(){
        serverList=new ArrayList<>();
    }
    public static LoadBalanceEager getInstance(){
        return loadBalanceEager;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServier(String server){
        serverList.remove(server);
    }

    public String getServer(int m){
        return serverList.get(m);
    }

    public static void main(String[] agrs) throws Exception{
        LoadBalanceEager loadBalance1=LoadBalanceEager.getInstance();
        LoadBalanceEager loadBalance2=LoadBalanceEager.getInstance();
        LoadBalanceEager loadBalance3=LoadBalanceEager.getInstance();
        System.out.println(loadBalance1);
        System.out.println(loadBalance2);
        System.out.println(loadBalance3);
    }

}

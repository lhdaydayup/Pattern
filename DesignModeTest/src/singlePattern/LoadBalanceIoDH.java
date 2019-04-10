package singlePattern;

import java.util.ArrayList;
import java.util.List;


//IoDH模式 使用内部类
//优点：解决了多线程出现非单例出现的问题,并且做到了延迟加载，完美的解决了饿汉式和懒汉式的缺点
//缺点：其他语言做不到
public class LoadBalanceIoDH{
    private List<String> serverList;

    private static class IoDH{
        private final static LoadBalanceIoDH loadBalance=new LoadBalanceIoDH();
    }
    private LoadBalanceIoDH(){
        serverList=new ArrayList<>();
    }
    public static LoadBalanceIoDH getInstance(){
        return IoDH.loadBalance;
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
        LoadBalanceIoDH loadBalance1=LoadBalanceIoDH.getInstance();
        LoadBalanceIoDH loadBalance2=LoadBalanceIoDH.getInstance();
        LoadBalanceIoDH loadBalance3=LoadBalanceIoDH.getInstance();
        System.out.println(loadBalance1);
        System.out.println(loadBalance2);
        System.out.println(loadBalance3);
    }

}

package singlePattern;

import java.util.ArrayList;
import java.util.List;


//存在缺点：多线程调用getInstance.可能会得到不是单例
public class LoadBalance {
    private static LoadBalance loadBalance=null;
    private List<String> serverList;
    private LoadBalance(){
        serverList=new ArrayList<>();
    }
    public static LoadBalance getInstance() {
        //多线程的情况下，这个判断会出现问题
        if(loadBalance==null){
            loadBalance=new LoadBalance();
        }
        return loadBalance;
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

    public static void main(String[] agrs) {
        LoadBalance loadBalance1=LoadBalance.getInstance();
        LoadBalance loadBalance2=LoadBalance.getInstance();
        LoadBalance loadBalance3=LoadBalance.getInstance();
        System.out.println(loadBalance1);
        System.out.println(loadBalance2);
        System.out.println(loadBalance3);
    }

}

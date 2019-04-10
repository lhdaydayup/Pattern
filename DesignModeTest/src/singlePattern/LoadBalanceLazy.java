package singlePattern;

import java.util.ArrayList;
import java.util.List;


//懒汉式单例
//优点：实现了延时加载，节约内存资源
//缺点：使用了双重检查锁定机制，性能会收到影响
public class LoadBalanceLazy {
    private static LoadBalanceLazy loadBalance=null;
    private List<String> serverList;
    private LoadBalanceLazy(){
        serverList=new ArrayList<>();
    }
    public static LoadBalanceLazy getInstance() {
        //多线程的情况下，这个判断会出现问题
        if(loadBalance==null){
            synchronized (LoadBalanceLazy.class){
                if(loadBalance==null){
                    loadBalance=new LoadBalanceLazy();
                }
            }
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
        LoadBalanceLazy loadBalance1=LoadBalanceLazy.getInstance();
        LoadBalanceLazy loadBalance2=LoadBalanceLazy.getInstance();
        LoadBalanceLazy loadBalance3=LoadBalanceLazy.getInstance();
        System.out.println(loadBalance1);
        System.out.println(loadBalance2);
        System.out.println(loadBalance3);
    }

}

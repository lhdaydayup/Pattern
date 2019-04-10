package singlePattern;

import java.util.ArrayList;
import java.util.List;


//自己创造的多例模式
public class LoadBalancePlus {
    private static List<LoadBalancePlus> loadBalancelist=null;
    private List<String> serverList;
    private LoadBalancePlus(){
        serverList=new ArrayList<>();
    }
    public static LoadBalancePlus getInstance(int num) {
        //多线程的情况下，这个判断会出现问题
        if(loadBalancelist==null){
            synchronized (LoadBalancePlus.class){
                if(loadBalancelist==null){
                    loadBalancelist=new ArrayList<>();
                }
            }
        }
        if(loadBalancelist.size()<num){
            loadBalancelist.add(new LoadBalancePlus());
        }

        return loadBalancelist.get(num-1);
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
        LoadBalancePlus loadBalance1= LoadBalancePlus.getInstance(1);
        LoadBalancePlus loadBalance2= LoadBalancePlus.getInstance(1);
        LoadBalancePlus loadBalance3= LoadBalancePlus.getInstance(2);
        LoadBalancePlus loadBalance4= LoadBalancePlus.getInstance(3);
        LoadBalancePlus loadBalance5= LoadBalancePlus.getInstance(2);
        LoadBalancePlus loadBalance6= LoadBalancePlus.getInstance(3);
        System.out.println(loadBalance1);
        System.out.println(loadBalance2);
        System.out.println(loadBalance3);
        System.out.println(loadBalance4);
        System.out.println(loadBalance5);
        System.out.println(loadBalance6);
    }

}

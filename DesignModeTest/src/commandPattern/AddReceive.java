package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class AddReceive {
    private int i=0;
    private List<Integer> iss=new ArrayList<>();
    private int index=0;

    public int add(int j){
        i+=j;
        iss.add(i);
        index=iss.size()-1;
        return i;
    }

    public int undo(){
        System.out.println("index:"+index);
        if(index<=0){
            System.out.println("无需要恢复的操作");
            return iss.get(0);
        }else{
            i=iss.get(--index);
            iss.add(i);
            return i;
        }
    }

    public int redo() {
        System.out.println("index:"+index);
        if(index>=iss.size()){
            i=iss.get(index);
        }else{
            i=iss.get(++index);
            iss.add(i);
        }
        return i;
    }
}

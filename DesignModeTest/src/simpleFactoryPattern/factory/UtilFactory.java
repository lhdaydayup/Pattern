package simpleFactoryPattern.factory;

import simpleFactoryPattern.product.DrawUtil;
import simpleFactoryPattern.product.FangXinDrawUtil;
import simpleFactoryPattern.product.SanJiaoXinDrawUtil;
import simpleFactoryPattern.product.YuanXinDrawUtil;

public class UtilFactory {

    public static DrawUtil getUtil(String msg){
        DrawUtil util;
        if(msg.equals("FangXin")){
            util=new FangXinDrawUtil();
        }else if(msg.equals("SanJiaoXin")){
            util=new SanJiaoXinDrawUtil();
        }else if(msg.equals("YuanXin")){
            util=new YuanXinDrawUtil();
        }else {
            throw new UnsupportedOperationException();

        }
        return util;
    }

}

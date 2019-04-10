package BridgePattern;

import XMLUtil.XMLUtil;
import simpleFactoryPattern.factory.UtilFactory;
import simpleFactoryPattern.product.DrawUtil;

import java.util.List;

public class Client {
    public static void main(String[] agrs){
      /*  DataSource mysqlSource=new MysqlDataSource();
        DataSource oracleSource=new OracleDataSource();
        Trans trans= new TxtTrans();
        trans.setData(oracleSource);
        trans.change();*/
        List<Object> objectList=XMLUtil.getBeans();
        DataSource dataSource=(DataSource)objectList.get(0);
        Trans trans=(Trans)objectList.get(1);
        trans.setData(dataSource);
        trans.change();
    }
}

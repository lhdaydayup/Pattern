package BridgePattern;

public class MysqlDataSource implements DataSource {
    @Override
    public void getData() {
        System.out.println("get Data from Mysql ");
    }
}

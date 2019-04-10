package BridgePattern;

public class OracleDataSource implements DataSource {
    @Override
    public void getData() {
        System.out.println("get Data from Oracle ");
    }
}

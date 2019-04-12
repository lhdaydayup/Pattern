package ChainOfResponsibilityPattern;

public class TGM extends Person{
    @Override
    public void approve(int money) {
        if(money<=30){
            System.out.println("总经理批准您的假期");
        }else {
            System.out.println("假期时间过长，总经理没有批准您的假期");
        }
    }
}

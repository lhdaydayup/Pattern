package ChainOfResponsibilityPattern;

public class GM extends Person {
    @Override
    public void approve(int money) {
        if(money<=10){
            System.out.println("经理批准您的假期");
        }else{
            person.approve(money);
        }
    }
}

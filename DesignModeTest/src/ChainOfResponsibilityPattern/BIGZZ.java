package ChainOfResponsibilityPattern;

public class BIGZZ extends Person {
    @Override
    public void approve(int money) {
        if(money<=2){
            System.out.println("大组长批准您的假期");
        }else{
            person.approve(money);
        }
    }
}

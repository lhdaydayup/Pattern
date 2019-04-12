package ChainOfResponsibilityPattern;

public class ZZ extends Person {
    @Override
    public void approve(int money) {
        if(money<=1){
            System.out.println("组长批准您的假期");
        }else{
            person.approve(money);
        }
    }
}

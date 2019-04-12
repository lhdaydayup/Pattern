package ChainOfResponsibilityPattern;

public class ZR extends Person {

    @Override
    public void approve(int money) {
        if(money<=3){
            System.out.println("主任批准您的假期");
        }else{
            person.approve(money);
        }
    }
}

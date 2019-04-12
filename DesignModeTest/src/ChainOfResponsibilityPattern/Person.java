package ChainOfResponsibilityPattern;

public abstract class Person {
    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public abstract void approve(int money);
}

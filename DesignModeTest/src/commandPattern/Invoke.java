package commandPattern;

public class Invoke {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public int excut(int i){
        return command.excute(i);
    }

    public int undo(){
        return command.undo();
    }

    public int redo(){
        return command.redo();
    }

    public static void main(String[] args){
        Invoke invoke=new Invoke();
        AddCommand addCommand=new AddCommand();
        invoke.setCommand(addCommand);
        System.out.println(invoke.excut(1));
        System.out.println(invoke.excut(2));
        System.out.println(invoke.excut(3));
        System.out.println(invoke.undo());
        System.out.println(invoke.undo());
        System.out.println(invoke.redo());
        System.out.println(invoke.redo());
        System.out.println(invoke.redo());
        System.out.println(invoke.redo());



    }
}

package commandPattern;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.List;

public class AddCommand extends Command {
    private AddReceive receive;

    public AddCommand() {
        this.receive = new AddReceive();
    }

    @Override
    public int excute(int i) {
        return receive.add(i);
    }

    @Override
    public int undo() {
        return receive.undo();
    }

    @Override
    public int redo() {
        return receive.redo();
    }
}

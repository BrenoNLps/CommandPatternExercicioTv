package invoker;
import commands.Command;

public class RemoteControl {
    public void executeCommand(Command command) {
        command.execute();
    }
}

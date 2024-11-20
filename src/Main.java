import commands.Command;
import commands.SetVolumeCommand;
import commands.TurnOffTVCommand;
import commands.TurnOnTVCommand;
import invoker.RemoteControl;
import receiver.TV;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl control = new RemoteControl();

        Command turnOn = new TurnOnTVCommand(tv);
        Command turnOff = new TurnOffTVCommand(tv);
        Command setVolume = new SetVolumeCommand(tv,10);


        control.executeCommand(turnOn);
        control.executeCommand(turnOff);
        control.executeCommand(setVolume);

    }
}
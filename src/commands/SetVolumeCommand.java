package commands;
import receiver.TV;

public class SetVolumeCommand implements Command {
    private TV tv;
    private int volume;

    public SetVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.setVolume(volume);
    }
}

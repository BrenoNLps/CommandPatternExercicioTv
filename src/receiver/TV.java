package receiver;

public class TV {
    private int volume;

    public void turnOn(){
        System.out.println("TV ligada");
    }
    public void turnOff(){
        System.out.println("TV desligada");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume atual: " + volume);
    }
}

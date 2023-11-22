package home;

public class HotDrink extends Product{
    private int volume;
    private int temperature;
    public HotDrink(String name, int volume, int temperature) {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + super.getName() +
                ";volume=" + volume +
                ";temperature=" + temperature + 
                '}';
    }
}
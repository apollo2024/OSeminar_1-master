package h_m_1;

public class HotBeverange extends Beverange{
    Integer temperature;
    public HotBeverange(String name, double cost, int volume,int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotBeverange{" +
                "temperature=" + temperature +
                '}';
    }
}

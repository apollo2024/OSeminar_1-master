package h_m_1;

public class hotBeverange extends Beverange{
    Integer temperature;
    public hotBeverange(String name, double cost, int volume,int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }
}

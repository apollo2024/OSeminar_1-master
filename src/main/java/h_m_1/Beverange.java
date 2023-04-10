package h_m_1;

public class Beverange extends Product{
    private Integer volume;

    public Beverange(String name, Double cost, Integer volume) {
        super(name, cost);
        this.volume = volume;
    }


    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

}

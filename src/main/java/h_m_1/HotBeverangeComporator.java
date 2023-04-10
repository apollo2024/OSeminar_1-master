package h_m_1;

import java.util.Comparator;

public class HotBeverangeComporator implements Comparator<Product> {
    private String type;

    public HotBeverangeComporator(String type) {
        this.type = type;
    }

    @Override
    public int compare(Product o1, Product o2) {
        HotBeverange p1 = (HotBeverange) o1;
        HotBeverange p2 = (HotBeverange) o2;
        if(this.type.equals("temperature")){
            return p1.getTemperature() - p2.getTemperature();
        }
        if(this.type.equals("volume")){
            return p1.getVolume() - p2.getVolume();
        }
        return 0;
    }
}

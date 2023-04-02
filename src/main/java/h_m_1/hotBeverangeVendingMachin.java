package h_m_1;

import java.util.ArrayList;

public class hotBeverangeVendingMachin extends BeverangeVendingMachin{

    public hotBeverangeVendingMachin(String name, Double cost, Integer volume, ArrayList<product> find_out) {
        super(name, cost, volume, find_out);
    }

    public ArrayList getProduct(String searchName, Integer volume, Integer temperature) {
        ArrayList<product> tempList = this.getProduct(searchName, volume);

        ArrayList<product> result = new ArrayList<>();
        for (product tempItem : tempList) {
            hotBeverange item = (hotBeverange) tempItem;
            if (item.getTemperature().equals(temperature)) {
                result.add(tempItem);
            }
        }
        return result;
    }


}

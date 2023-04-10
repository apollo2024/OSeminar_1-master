package h_m_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class HotBeverangeVendingMachin extends BeverangeVendingMachin implements  Iterable{


    public HotBeverangeVendingMachin(String name, Double cost, Integer volume, ArrayList<Product> find_out) {
        super(name, cost, volume, find_out);
    }

    public HotBeverangeVendingMachin(String name, Double cost, Integer volume) {
        super(name, cost, volume);
    }


    public ArrayList getProduct(String searchName, Integer volume, Integer temperature) {
        ArrayList<Product> tempList = this.getProduct(searchName, volume);

        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            HotBeverange item = (HotBeverange) tempItem;
            if (item.getTemperature().equals(temperature)) {
                result.add(tempItem);
            }
        }
        return result;
    }


    @Override
    public Iterator iterator() {
        return find_out.iterator();
    }
    public void sort(HotBeverangeComporator temp){
        find_out.sort(temp);
    }
}

package h_m_1;

import java.util.ArrayList;

public class BeverangeVendingMachin extends Beverange implements vendingMachine{
    private ArrayList<product> find_out;


    public BeverangeVendingMachin(String name, Double cost, Integer volume, ArrayList<product> find_out) {
        super(name, cost, volume);
        this.find_out = find_out;
    }

    public void addProduct(product newItem) {
        find_out.add(newItem);
    }
    public ArrayList getProduct(String searchName, Integer volume){
        ArrayList<product> list = getProductByName(searchName);
        ArrayList<product> result = new ArrayList<>();
        for (product item : list) {
            hotBeverange temp = (hotBeverange) item;
            if(item.getVolume().equals(volume)){
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public ArrayList getProductByName(String searchName) {
        ArrayList<product> temp = new ArrayList<product>();
        for (var item : find_out) {
            if (item.getName().contains(searchName)) {
                temp.add(item);
            }
        }
        return temp;
    }

    @Override
    public ArrayList getProductByPrice(Double searchCost) {
        ArrayList<product> result = new ArrayList<product>();
        for (var item : find_out) {
            if (item.getCost().equals(searchCost)) {
                result.add(item);
            }
        }
        return result;
    }
}

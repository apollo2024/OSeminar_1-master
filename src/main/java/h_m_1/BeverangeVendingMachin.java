package h_m_1;

import java.util.ArrayList;

public class BeverangeVendingMachin extends Beverange implements vendingMachine{
    protected ArrayList<Product> find_out;


    public BeverangeVendingMachin(String name, Double cost, Integer volume, ArrayList<Product> find_out) {
        super(name, cost, volume);
        this.find_out = find_out;
    }

    public BeverangeVendingMachin(String name, Double cost, Integer volume) {
        super(name, cost, volume);
    }



    public void addProduct(Product newItem) {
        find_out.add(newItem);
    }
    public ArrayList getProduct(String searchName, Integer volume){
        ArrayList<Product> list = getProductByName(searchName);
        ArrayList<Product> result = new ArrayList<>();
        for (Product item : list) {
            HotBeverange temp = (HotBeverange) item;
            if(((HotBeverange) item).getVolume().equals(volume)){
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public ArrayList getProductByName(String searchName) {
        ArrayList<Product> temp = new ArrayList<Product>();
        for (var item : find_out) {
            if (item.getName().contains(searchName)) {
                temp.add(item);
            }
        }
        return temp;
    }

    @Override
    public ArrayList getProductByPrice(Double searchCost) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (var item : find_out) {
            if (item.getCost().equals(searchCost)) {
                result.add(item);
            }
        }
        return result;
    }
    public void printProducts(){
        for (Product item : find_out){
            System.out.println(item);
        }
    }
}

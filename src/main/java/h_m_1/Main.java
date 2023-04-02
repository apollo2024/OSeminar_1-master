package h_m_1;

import java.util.ArrayList;

/**
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
 * перегруженный метод getProduct(int name, int volume, int temperature)
 * выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        hotBeverangeVendingMachin machineHotWater = new hotBeverangeVendingMachin();
        machineHotWater.addProduct(new hotBeverange("smth1", 450.0, 2, 60));
        machineHotWater.addProduct(new hotBeverange("smth1", 897.0, 3, 30));
        machineHotWater.addProduct(new hotBeverange("smth2", 300.0, 3, 50));
        machineHotWater.addProduct(new hotBeverange("smth3", 300.0, 1, 40));
        machineHotWater.addProduct(new hotBeverange("smth3", 200.0, 3, 50));
        machineHotWater.addProduct(new hotBeverange("smth2", 200.0, 1, 50));

        ArrayList<product> res = machineHotWater.getProduct("3", 1, 50);
        System.out.println(res);
    }
}

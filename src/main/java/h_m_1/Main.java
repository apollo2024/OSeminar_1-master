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
        HotBeverangeVendingMachin HotWater = new HotBeverangeVendingMachin("smth0", 300.0, 1);
        HotWater.addProduct(new HotBeverange("smth1", 450.0, 2, 60));
        HotWater.addProduct(new HotBeverange("smth1", 897.0, 3, 30));
        HotWater.addProduct(new HotBeverange("smth2", 300.0, 3, 50));
        HotWater.addProduct(new HotBeverange("smth3", 300.0, 1, 40));
        HotWater.addProduct(new HotBeverange("smth3", 200.0, 3, 50));
        HotWater.addProduct(new HotBeverange("smth2", 200.0, 1, 50));

        HotWater.printProducts();
        System.out.println("---");
        HotWater.sort(new HotBeverangeComporator("temperature"));
        HotWater.printProducts();

        for (Object item : HotWater){
            System.out.println("iterated: " + item);
        }
    }
}

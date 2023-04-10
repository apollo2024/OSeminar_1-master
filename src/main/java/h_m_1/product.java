package h_m_1;


public class Product {
    private String name;
    private Double cost;

    public Product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product {" +
                "name= " + name + " " +
                ", cost=" + cost +
                '}';
    }
}

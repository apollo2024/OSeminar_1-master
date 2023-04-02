package h_m_1;


public abstract class product {
    private String name;
    private Double cost;

    public product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
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

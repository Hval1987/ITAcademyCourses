package task3.src.model;

public class Refrigerator {
    private String id;
    private int power_consumption;
    private int weight;
    private int freezer_capacity;
    private double overal_capacity;
    private double height;
    private double width;

    public Refrigerator() {}

    public Refrigerator(String id, int power_consumption, int weight, int freezer_capacity, int overal_capacity, double height, double width) {
        this.id = id;
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.freezer_capacity = freezer_capacity;
        this.overal_capacity = overal_capacity;
        this.height = height;
        this.width = width;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPowerConsumption() {
        return power_consumption;
    }

    public void setPowerConsumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezer_capacity;
    }

    public void setFreezerCapacity(int freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    public double getOveralCapacity() {
        return overal_capacity;
    }

    public void setOveralCapacity(double overal_capacity) {
        this.overal_capacity = overal_capacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "Id='" + id + '\'' +
                ", power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", freezer_capacity=" + freezer_capacity +
                ", overal_capacity=" + overal_capacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}

package task3.src.model;

public class Oven {

    private String id;
    private int power_consumption;
    private int weight;
    private int capacity;
    private double depts;
    private double width;
    private double height;

    public Oven() { ;
    }

    public Oven(String name, int power_consumption, int weight, int capacity, double depts, double width, double height) {
        this.id = id;
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depts = depts;
        this.width = width;
        this.height = height;
    }
    public int getPower_consumption() {
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepts() {
        return depts;
    }

    public void setDepts(double depts) {
        this.depts = depts;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getId() {return id;}

    public void setId(String id) {this.id = id;}


    @Override
    public String toString() {
        return "Oven{" +
                "id='" + id + '\'' +
                ", power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depts=" + depts +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

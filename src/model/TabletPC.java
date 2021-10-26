package task3.src.model;

public class TabletPC {
    private String id;
    private double batteryCapacity;
    private double displayInch;
    private  int memoryRom;
    private int memoryCapacity;
    private String color;

    public TabletPC() {}

    public TabletPC(String id, int batteryCapacity, double displayInch, int memoryRom, int memoryCapacity, String color) {
        this.id = id;
        this.batteryCapacity = batteryCapacity;
        this.displayInch = displayInch;
        this.memoryRom = memoryRom;
        this.memoryCapacity = memoryCapacity;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(double displayInch) {
        this.displayInch = displayInch;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "id=" + id +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInch=" + displayInch +
                ", memoryRom=" + memoryRom +
                ", memoryCapacity=" + memoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}

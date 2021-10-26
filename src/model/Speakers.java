package task3.src.model;

public class Speakers {
    private String id;
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequanseRange;
    private String CordRange;

    public Speakers() {}

    public Speakers(String id, int powerConsumption, int numberOfSpeakers, String frequanseRange, String cordRange) {
        this.id = id;
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequanseRange = frequanseRange;
        CordRange = cordRange;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPowerConsuption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequanseRange() {
        return frequanseRange;
    }

    public void setFrequanseRange(String frequanseRange) {
        this.frequanseRange = frequanseRange;
    }

    public String getCordRange() {
        return CordRange;
    }

    public void setCordRange(String cordRange) {
        CordRange = cordRange;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "id='" + id + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequanseRange='" + frequanseRange + '\'' +
                ", CordRange='" + CordRange + '\'' +
                '}';
    }
}

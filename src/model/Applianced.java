package task3.src.model;

import java.util.List;

public class Applianced {

    private List<Oven> ovenList;
    private List<Laptop> laptopList;
    private List<Refrigerator> refrigeratorList;

    public Applianced( List<Oven> ovenList, List<Laptop> laptopList, List<Refrigerator> refrigeratorList) {

        this.ovenList = ovenList;
        this.laptopList = laptopList;
        this.refrigeratorList = refrigeratorList;
    }

    public static class get {

    }
}

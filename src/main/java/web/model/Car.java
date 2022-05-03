package web.model;

public class Car {

    private String model;
    private String color;
    private int year;

    public Car() {
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "model " + model + "  color " + color + "  year of manufacture " + year + "\n" + "---------------------";
    }
}
package web.model;

public class Car {

    private String model;

    private int year;

    private String colour;

    public Car(String model, int year, String colour) {
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

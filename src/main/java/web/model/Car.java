package web.model;

public class Car {
    private String brand;
    private String model;
    private int yearOfBuild;

    public Car(String brand, String model, int yearOfBuild) {
        this.brand = brand;
        this.model = model;
        this.yearOfBuild = yearOfBuild;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

}

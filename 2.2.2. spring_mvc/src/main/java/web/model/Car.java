package web.model;

public class Car {
    private String model;
    private String country;
    private int ageCreate;

    public Car(String model, String country, int ageCreate) {
        this.model = model;
        this.country = country;
        this.ageCreate = ageCreate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", ageCreate=" + ageCreate +
                '}';
    }
}

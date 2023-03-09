package InterfacesAndAbstraction.P01CarShop;

public class Seat implements Car{

    private String model;
    private String color;
    private Integer hp;
    private String countryProduced;

    public Seat(String model, String color, Integer hp, String countryProduced) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return hp;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires",
                getModel(), countryProduced, TIRES);
    }
}

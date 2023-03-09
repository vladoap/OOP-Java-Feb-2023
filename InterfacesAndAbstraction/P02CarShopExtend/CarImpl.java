package InterfacesAndAbstraction.P02CarShopExtend;

public abstract class CarImpl implements Car{

    private String model;
    private String color;
    private Integer hp;
    private String countryProduced;

    public CarImpl(String model, String color, Integer hp, String countryProduced) {
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

    public Integer getHorsePower() {
        return hp;
    }

    public String countryProduced() {
        return countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %s tires",
                getModel(), countryProduced, TIRES);
    }
}

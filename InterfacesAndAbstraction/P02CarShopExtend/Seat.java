package InterfacesAndAbstraction.P02CarShopExtend;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer hp, String countryProduced, Double price) {
        super(model, color, hp, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator())
                .append(String.format("%s sells for %f", getModel(), getPrice()));

        return sb.toString();
    }

}

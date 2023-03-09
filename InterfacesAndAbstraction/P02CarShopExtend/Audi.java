package InterfacesAndAbstraction.P02CarShopExtend;

public class Audi extends CarImpl implements Rentable{

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer hp, String countryProduced,
                Integer dayRent, Double pricePerDay) {
        super(model, color, hp, countryProduced);
        this.minRentDay = dayRent;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator())
                .append(String.format("Minimum rental period of %d days. Price per day %f",
                        getMinRentDay(), getPricePerDay()));

        return sb.toString();
    }
}

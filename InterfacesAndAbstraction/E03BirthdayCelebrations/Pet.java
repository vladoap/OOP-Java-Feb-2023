package InterfacesAndAbstraction.E03BirthdayCelebrations;


public class Pet implements Birthable {

    private String name;
    private String birthData;

    public Pet(String name, String birthData) {
        this.name = name;
        this.birthData = birthData;
    }


    public String getName() {
        return name;
    }


    @Override
    public String getBirthDate() {
        return birthData;
    }
}

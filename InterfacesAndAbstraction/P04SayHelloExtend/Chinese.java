package InterfacesAndAbstraction.P04SayHelloExtend;



public class Chinese extends BasePerson  {

    private String name;

    public Chinese(String name) {
        super(name);
    }



    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}

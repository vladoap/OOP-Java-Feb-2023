package Polymorphism.E03Word;

public class Initialization extends CommandImpl {


    public Initialization(StringBuilder text) {
        super(text);
        super.init();
    }

    public static CommandInterface buildCommandInterface(StringBuilder text) {
      return new Initialization(text);
    }


}

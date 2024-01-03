import java.util.Random;

public class DemoforP extends Alien{

    // if it is a class for a type:
    public DemoforP(){
        super("DemoforP");
    }

    //if writing the Alien or betterAlienFactory
        //need to make a name, random integer; do getName class and override string method
    private final String NAME;
    private static Random r = new Random();

    public DemoforP(String type){
        NAME = type + r.nextInt(100);
    }

    //override toString here
    //do getName here

    //if writing the videogame

    //if writing the betterAlienFactory
    // need to make the enum + make a new Random variable to initialize them
    public enum Types{SquidType, AlienType, TigerType, LionType}
    private static Random p = new Random();
    public Alien getAlien() {
        Alien a = new Alien();
        int randomInt = r.nextInt(Types.values().length);  // need to do next int for values for length
        Types t = Types.values()[randomInt];
        return alien;
    }
    Types.values()[p]
}

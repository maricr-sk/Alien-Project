import java.util.Random;

public class Alien {

    private final String name;
    private static Random r = new Random(); // is a static area so all static variables are initialized

    public Alien(String type) {
        this.name = type + r.nextInt(100); // generate a random number [0, 100)
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String getName(){
        return name;
    }
}

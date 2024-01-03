public class VideoGame {

    private Alien [] aliens;
    private static final int COUNT = 10;
    private static BetterAlienFactory factory = new BetterAlienFactory();

    public VideoGame(){
        aliens = new Alien [COUNT];
    }

    public static void main(String [] args){
        BetterAlienFactory factory = new BetterAlienFactory();
        for(int i = 0; i < COUNT; ++i) {
            Alien a = factory.getAlien();
            System.out.println(a); }
    }

    public void printAliens(){
        for(Alien a : aliens){
            System.out.println(a); }
    }

    /*
    user will say AlienFactory = new AlienFacotry();
    Alien a = factory.getAlien();
    Creates a random alien, does not need to know which alien
    - > better way to share them among a group
     */
}

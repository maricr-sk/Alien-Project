import java.util.Random;

public class BetterAlienFactory {

        private enum Types{SquidAlien,  RatAlien, MonkeyAlien, TigerAlien }
        private static Random r = new Random();                  

        public Alien getAlien() {
            //create another alien
            Alien alien = null;
            int randomIndex = r.nextInt(Types.values().length);
            Types t = Types.values()[randomIndex];

            try{
                alien = (Alien)(Class.forName(t.toString()).getDeclaredConstructor().newInstance());
            } catch (Exception e ) {
                System.out.println("Unknown class type.");
            }
            return alien;
        }
}

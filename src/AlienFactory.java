public class AlienFactory {

    private static final int COUNT = 10;

    private enum Types{
        SquidAlien,  RatAlien, MonkeyAlien, TigerAlien;
    }

    public Alien getAlien() {
            //create another alien
             Alien a = null;
            int howManyTypes = Types.values().length;
            int randomIndex = (int) (Math.random() * howManyTypes);
            switch (randomIndex) {
                case 0:
                    a = new SquidAlien();
                    break;
                case 1:
                    a = new RatAlien();
                    break;
                case 2:
                    a = new MonkeyAlien();
                    break;
                case 3:
                    a = new TigerAlien();
                    break;
                default:
                    a = new Alien("Unknown");
                    break;
            }
            return a;
    }
}

public class Goat implements Tradable, Drivable, Domesticatable {
    private int maxSpeed;
    public Goat() {this.maxSpeed = 3;}
    @Override
    public int getPrice() {return 35;}
    @Override
    public String sound() {return "Maaaa~";}
    @Override
    public void upgradeSpeed() {this.maxSpeed += 2;}
    @Override
    public void downgradeSpeed() {this.maxSpeed -= 2;}
    @Override
    public int getMaxSpeed() {return this.maxSpeed;}}

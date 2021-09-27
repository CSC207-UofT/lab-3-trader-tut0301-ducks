public class cow  implements  Tradable, Drivable{
    private int maxSpeed = 10;
    @Override
    public void upgradeSpeed() {
        this.maxSpeed ++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed --;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 20;
    }
}

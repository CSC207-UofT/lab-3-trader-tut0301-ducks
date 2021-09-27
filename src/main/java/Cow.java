public class Cow implements Domesticatable, Tradable{

    @Override
    public String sound() {
        return "MOOOOOOOOOOOOOO";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

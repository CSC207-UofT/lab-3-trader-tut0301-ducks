/*
    Hamster Class
 */
public class Hamster implements Domesticatable, Tradable{

    @Override
    public String sound() {
        return "HAMSTER SOUND!!!";
    }

    @Override
    public int getPrice() {
        return 1000000;
    }
}

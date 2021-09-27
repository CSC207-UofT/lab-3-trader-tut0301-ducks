public class Duck implements Domesticatable, Tradable {
    public Duck() {}

    @Override
    public String sound() {return "Quack!";}

    @Override
    public  int getPrice() {return 5;}

}
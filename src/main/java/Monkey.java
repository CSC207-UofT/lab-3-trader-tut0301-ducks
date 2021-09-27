public class Monkey implements Domesticatable, Tradable{
    @Override
    public String sound() {
        return "OOOHAHAHHAHAHOOOOHAHAHAH!";
    }

    @Override
    public int getPrice() {
        return 6;
    }
}

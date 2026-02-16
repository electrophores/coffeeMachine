abstract class Coffee {
    protected String name;
    protected int volume;
    protected double price;

    public Coffee(String name, int volume, double price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public void info() {
        System.out.println(name + ": " + volume + " мл, цена " + price + " руб.");
    }
}
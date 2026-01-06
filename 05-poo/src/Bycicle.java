public class Bycicle extends Vehicle{
    private boolean hasBell;

    public Bycicle(String brand, String model, int year, boolean hasBell) {
        super(brand, model, year);
        this.hasBell = hasBell;
    }
}

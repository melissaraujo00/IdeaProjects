public class Motorcicle extends Vehicle {
    private boolean hasSidecar;
    private Engine engine;

    public Motorcicle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
        this.engine = new Engine();
    }

    public void popWheelie(){
        System.out.println("La moto esta haciendo willy");
    }

    public void start() {
        System.out.println("La moto esta encendida");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motorcicle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}

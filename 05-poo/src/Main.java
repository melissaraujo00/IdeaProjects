public class Main {
    static void main(String[] args) {
        /*Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);

        vehicle.setYear(170);

        System.out.println(vehicle.toString());*/

        Vehicle myCar = new Car("Toyota","Corolla",2021, 4);
        Vehicle motorcicle = new Motorcicle("Honda", "CBR",2021, false);

        ((Car)myCar).start();
        ((Motorcicle)motorcicle).start();

        printVehicle(motorcicle);
        printVehicle(myCar);

        ((Car)myCar).setDoors(5);
    }

    public static void printVehicle(Vehicle car){
        System.out.println(car.toString());
    }
}
public class Engine {
    public void start(){
        System.out.println("El motor encendido");
    }

    public void start(boolean siletMode){
        if (siletMode) {
            System.out.println("Esta encendido en modo silenciosos");
        }
        else {
            System.out.println("El vehiculo se encendio");
        }
    }
}

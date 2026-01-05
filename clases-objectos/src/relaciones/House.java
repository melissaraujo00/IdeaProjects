package relaciones;

public class House {
    private Room room; //composicion
    private Door door; //composicion
    private Owner owner; //asociacion -- cuando no depende para existir

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}

public abstract class Stalls {

    private final String name;
    private final String ownerName;
    private final int parkingSpot;

    public Stalls(String name, String ownerName, int parkingSpot ) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }
}

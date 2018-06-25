public class BeerStall extends Stalls {


    private int ageRestriction;

    public BeerStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.ageRestriction = 18;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }
}

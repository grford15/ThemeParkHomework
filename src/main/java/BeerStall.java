public class BeerStall extends Stalls implements ISecurity {


    private int ageRestriction;

    public BeerStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.ageRestriction = 18;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > this.ageRestriction;
    }
}

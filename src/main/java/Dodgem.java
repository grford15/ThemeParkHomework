public class Dodgem extends Attractions implements ISecurity{

    public Dodgem(String name, int heightRestriction) {
        super(name, heightRestriction);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > this.getHeightRestriction();
    }
}

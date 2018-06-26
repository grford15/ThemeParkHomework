

public class Rollercoaster extends Attractions implements ITicketed, ISecurity {

    ;

    public Rollercoaster(String name, int heightRestriction) {
        super(name, heightRestriction);

    }


    public int defaultPrice() {
        return 5;
    }


    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > this.getHeightRestriction();
    }
}

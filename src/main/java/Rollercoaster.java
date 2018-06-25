

public class Rollercoaster extends Attractions {

    ;

    public Rollercoaster(String name, int heightRestriction) {
        super(name, heightRestriction);

    }

    public boolean visitorCanRide(Visitor visitor, Rollercoaster rollercoaster) {
        return visitor.getHeight() > rollercoaster.getHeightRestriction();
    }
}

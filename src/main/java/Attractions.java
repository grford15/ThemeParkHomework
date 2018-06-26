public abstract class Attractions {

    private String name;
    private int heightRestriction;

    public Attractions(String name, int heightRestriction) {
        this.name = name;
        this.heightRestriction = heightRestriction;
    }


    public String getName() {
        return name;
    }

    public int getHeightRestriction() {
        return heightRestriction;
    }
}
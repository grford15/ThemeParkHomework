public enum IceCream {

    CONE(3, "Cone"),
    ONESCOOP(1, "One Scoop"),
    TWOSCOOP(2, "Two Scoop");

    private int price;
    private String name;

    IceCream(int price, String name){
        this.price = price;
        this.name = name;
    }
}

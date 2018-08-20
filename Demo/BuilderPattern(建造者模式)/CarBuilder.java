package henu.xb;

public abstract class CarBuilder {
    private CarProduct product;
    public abstract void buildDoor();
    public abstract void buildTires();
    public abstract void buildSteeringWheel();
    public abstract CarProduct build();
}

package henu.xb;

public class Director {
    public CarProduct Construct(CarBuilder builder){
        builder.buildDoor();
        builder.buildSteeringWheel();
        builder.buildTires();
        return builder.build();
    }
}

package henu.xb;

public class SportCarBuilder extends CarBuilder {
    private CarProduct product = new CarProduct("跑车");

    @Override
    public void buildDoor() {
        product.addPart("跑车车门");
    }
    @Override
    public void buildTires() {
        product.addPart("跑车轮胎");
    }
    @Override
    public void buildSteeringWheel() {
        product.addPart("跑车方向盘");
    }

    @Override
    public CarProduct build() {
        return this.product;
    }
}

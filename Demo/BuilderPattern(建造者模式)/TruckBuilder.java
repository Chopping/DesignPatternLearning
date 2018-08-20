package henu.xb;

public class TruckBuilder extends CarBuilder {
    private CarProduct product = new CarProduct("卡车");
    @Override
    public void buildDoor() {
        product.addPart("卡车车门");
    }

    @Override
    public void buildTires() {
        product.addPart("卡车轮胎");
    }

    @Override
    public void buildSteeringWheel() {
        product.addPart("卡车方向盘");
    }

    @Override
    public CarProduct build() {
        return this.product;
    }
}

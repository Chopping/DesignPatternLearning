package henu.chinaboy.xb.Players;

public class Forward extends Player{
    public Forward(String name){
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("前锋 "+name+" 进攻!");
    }

    @Override
    public void defend() {
        System.out.println("前锋 "+name+" 防守!");
    }
}

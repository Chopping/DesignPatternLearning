package henu.chinaboy.xb.AdpaterPart;

public class ForeignCenter {
    String name;
    public ForeignCenter(String name){
        this.name = name;
    }

    public void ForeignAttack() {
        System.out.println("外籍中锋 "+name+" 进攻!");
    }

    public void ForeignDefend() {
        System.out.println("外籍中锋 "+name+" 防守!");
    }
}

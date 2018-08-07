package henu.chinaboy.xb.Observer;

/**
 * 观察者对象抽象
 */
public abstract class OberverObject {
    protected String name;

    @Override
    public String toString(){
        return this.name;
    }
}

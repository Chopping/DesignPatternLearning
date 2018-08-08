package henu.chinaboy.xb.SingletonClass;

/**
 * 饿汉单例模式
 * 意在解决 普通的单利模式隐式存在的多例现象
 * 通过直接实例化instance对象，保证在类在加载的同时生成此唯一的instance对象
 * 缺点就是此模式没有考虑单例对象对内存的占用情况，必须等到类被卸载的时候方能解除此实例的内存占用
 * 就如同饿汉一般，享用食物不考虑接下来是否还需要继续进食
 */
public class EagerSingletonClass {
    private static final EagerSingletonClass instance = new EagerSingletonClass();

    private EagerSingletonClass(){}

    public static EagerSingletonClass getInstance(){
        return instance;
    }
}

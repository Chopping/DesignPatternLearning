package henu.chinaboy.xb.SingletonClass;

/**
 * Initialization Demand Holder (IoDH)技术，是懒汉单例模式和饿汉单例模式的结合体
 * 通过采用以内部静态类的静态成员对象保存instance的方式，即实现了延迟加载又可以不采用同步的机制，在Java中式优选地单例模式
 * 缺点是很多面向对象（Object Oriented Programing /OOP）语言不支持此模式，所幸Java支持
 */
public class IoDHSingleton {
    // 持有instance的内部类
    private static final class InstanceHolder{
        private final static IoDHSingleton instance = new IoDHSingleton();
    }
    public static IoDHSingleton getInstance(){
        return InstanceHolder.instance;
    }
}

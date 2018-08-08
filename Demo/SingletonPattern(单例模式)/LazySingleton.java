package henu.chinaboy.xb.SingletonClass;

/**
 * 懒汉单例模式，旨在通过延迟加载（Lazy Load）、双重检查锁定(Double Check Locking)等手段使类的实例唯一
 * 优点是解决了饿汉单例模式中由于一开始就加载instance所导致的可能出现的内存紧张的问题（懒汉模式使用了延迟加载，可以即用即加载）
 * 缺点是，使用了双重检查锁定以及同步 势必带来性能上的损耗
 * 懒汉的意味体现在延迟加载上
 */
public class LazySingleton {
    private volatile static LazySingleton instance;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(null == instance) // 如果只有这一个nul==instance（即将下面的那行去掉），那么还是导致多例的现象，多个线程会执行实例化的操作
            synchronized (LazySingleton.class){// 这里获取了LazySingleton class对象的锁，利用同步机制限制每次对instance执行实例化的操作线程仅为一个，
                if (null==instance)// 双重检查锁定
                    instance = new LazySingleton();
            }
        return instance;
    }
}

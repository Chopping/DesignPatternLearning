package henu.chinaboy.xb.NotifyObject;

import henu.chinaboy.xb.Event.EventHandler;

/**
 * 发布者抽象
 */
public abstract class Notifier {
    protected EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }
    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * 注册 Observer 对象以及其响应变化的方法
     * @param object
     * @param methodName
     * @param objects
     */
    public abstract void addListener(Object object,String methodName,Object... objects);

    /**
     * 发布变化，调用 Observer 注册的方法
     */
    public abstract void notifyAllListener();
}

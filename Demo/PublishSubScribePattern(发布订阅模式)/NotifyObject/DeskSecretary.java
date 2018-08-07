package henu.chinaboy.xb.NotifyObject;

import henu.chinaboy.xb.Event.Event;

/**
 * 前台助理类
 */
public class DeskSecretary extends Notifier{

    public DeskSecretary(){
        System.out.println("前台秘书已经上线！开始监听老板的走向....");
    }

    @Override
    public void addListener(Object object, String methodName, Object... objects) {
        System.out.println(object.toString()+"找到前台秘书帮忙！老板来的时候就"+methodName+"ta");
        eventHandler.addEvent(object,methodName,objects);
    }

    @Override
    public void notifyAllListener() {
        try {
            eventHandler.notifyAllEvent();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

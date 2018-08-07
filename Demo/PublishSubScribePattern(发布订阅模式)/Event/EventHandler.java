package henu.chinaboy.xb.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理对象，相当于.Net中的委托，当此Handler挂载了其他方法的时候，
 * 在Handler的notify方法被触发的时候，Handler将会对挂载的方法一一调用
 */
public class EventHandler {
    private List<Event> events;// 当某件事情发生时，需要触发哪些对象的变化，变化的对象以及方法都封装在了这些events当中

    public EventHandler(){
        events = new ArrayList<Event>();
    }

    /**
     * 添加等待应对变化的对象以及需要调用的方法
     * @param object
     * @param methodName
     * @param args
     */
    public void addEvent(Object object,String methodName,Object...args){
        events.add(new Event(object,methodName,args));
    }

    /**
     * 触发变化事件，调用响应对象所预设的方法
     * @throws Exception
     */
    public void notifyAllEvent() throws Exception{
        for(Event e: events){
            e.invoke();
        }
    }
}

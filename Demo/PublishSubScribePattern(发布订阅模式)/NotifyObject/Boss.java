package henu.chinaboy.xb.NotifyObject;

/**
 * 老板类
 */
public class Boss extends Notifier {
    public Boss(){
        System.out.println("老板上线，老板准备抵达现场！");
    }

    @Override
    public void addListener(Object object, String methodName, Object... objects) {
        System.out.println("老板视野里有："+object.toString());
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

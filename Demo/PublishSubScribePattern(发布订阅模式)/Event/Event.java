package henu.chinaboy.xb.Event;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

/**
 * 回调对象
 */
public class Event {
    private Object object;// 被调用的对象
    private String methodName;// 被调用的方法
    private Class[] methodParametersType;// 方法参数类别列表
    private Object[] params;// 方法参数列表
    /**
     *
     * @param object
     * @param methodName
     * @param args 可变参数 代表可以传递一个或者一个数组进来
     */
    public Event(Object object,String methodName,Object...args){
        this.object=object;// 赋值对象
        this.methodName = methodName;// 复制调用方法名
        params = args;// 获取参数列表
        contractParamType(params);// 获取参数列表的参数类型
    }

    /**
     * 将传递进来的参数列表对象转换为Event对象的参数列表的值
     * @param params
     */
    public void contractParamType(Object[] params){
        if(null==params){
            methodParametersType = null;
        }else{
            methodParametersType = new Class[params.length];
            for(int i=0;i<params.length;i++){
                methodParametersType[i]=params[i].getClass();
            }
        }
    }


    public void invoke() throws Exception{
        // 反射获取对象的方法实例
        Method method = object.getClass().getMethod(methodName,methodParametersType);
        if(null==method){
            return;
        }
        else
            method.invoke(object,params);// 调用此方法
    }
}

package henu.chinaboy.xb;

import henu.chinaboy.xb.LessonPart.ILessonOperate;
import henu.chinaboy.xb.UserPart.IUserOperate;

/**
 * 对客户端开放的类，也就是客户端只需要知道这个类即可，不需要知道如何获取数据的以及使用的是什么数据库
 * 此类也不需要知道使用的什么数据库，因为采用的是反射的机制，动态选择使用的数据库类型，将数据库类型信息存放在XML文件中。
 * 解除了 客户端-数据库的耦合 以及 数据访问-数据库类型的耦合
 *
 * 这里还引用了IoDH 单例模式，因为数据库操作对于所有进程应该是唯一的，有点类似一个切面的概念
 */
public class DataAccessHelper {
    // 这里还有可以改善的部分，例如将名字写入XML文件中，使用XMLReader读取相关信息，解除硬编码
    private static String DataBaseSystemName = "SQLServer";
    private IUserOperate userOperate;
    private ILessonOperate lessonOperate;
    private DataAccessHelper(){}

    public void CreateUser(String userName,int age){
        userOperate.CreateUser(userName,age);

    }

    public synchronized void initializeHelper(){
        try {
            userOperate = (IUserOperate) Class.forName(String.format("henu.chinaboy.xb.UserPart.%sUserOperate",DataBaseSystemName)).newInstance();
            lessonOperate = (ILessonOperate) Class.forName(String.format("henu.chinaboy.xb.LessonPart.%sLessonOperate",DataBaseSystemName)).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public void GetUser(String userName){
        userOperate.GetUser(userName);
    }

    public void CreateLesson(String lessonName){
        lessonOperate.CreateLesson(lessonName);
    }

    public void GetLesson(String lessonName){
        lessonOperate.GetLesson(lessonName);
    }

    public static DataAccessHelper getInstance(){
        return InstanceHolder.instance;
    }

    private final static class InstanceHolder{
        private static final DataAccessHelper instance = new DataAccessHelper();
     }
}

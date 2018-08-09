package henu.chinaboy.xb;

/**
 * 抽象工厂Demo
 * 抽象工厂、工厂、简单工厂可以理解为 简单工厂 进一步抽象 变成工厂 ，工厂 进一步抽象 变成抽象工厂
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        DataAccessHelper helper = DataAccessHelper.getInstance();
        helper.initializeHelper();
        helper.CreateUser("小明",12);
        helper.CreateLesson("语文");
        helper.GetUser("小明");
        helper.GetLesson("语文");
    }
}

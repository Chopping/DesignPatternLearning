package henu.chinaboy.xb.LessonPart;

public class SQLServerLessonOperate implements ILessonOperate {
    @Override
    public void CreateLesson(String lessonName) {
        System.out.println("利用SQLServer数据库操作 创建了一个新的课程："+lessonName);
    }

    @Override
    public void GetLesson(String lessonName) {
        System.out.println("利用SQLServer数据库操作 获取"+lessonName+"的信息");
    }
}

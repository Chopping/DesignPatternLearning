package henu.chinaboy.xb.LessonPart;

/**
 * 定义对Lesson操作的接口，解除客户端对数据库访问的依赖
 */
public interface ILessonOperate {
    public void CreateLesson(String lessonName);
    public void GetLesson(String lessonName);
}

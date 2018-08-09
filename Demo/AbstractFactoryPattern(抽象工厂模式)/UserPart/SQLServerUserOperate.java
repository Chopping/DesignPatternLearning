package henu.chinaboy.xb.UserPart;

public class SQLServerUserOperate implements IUserOperate {
    @Override
    public void CreateUser(String userName, int age) {
        System.out.println("利用SQLServer数据库操作 创建了一个新的用户："+userName);
    }

    @Override
    public void GetUser(String userName) {
        System.out.println("利用SQLServer数据库操作 获取"+userName+"的信息");
    }
}

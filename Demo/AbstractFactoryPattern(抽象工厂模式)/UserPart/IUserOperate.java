package henu.chinaboy.xb.UserPart;

/**
 * 定义对User操作的接口，解除客户端对数据库访问的依赖
 */
public interface IUserOperate {
    public void CreateUser(String userName,int age);
    public void GetUser(String userName);
}

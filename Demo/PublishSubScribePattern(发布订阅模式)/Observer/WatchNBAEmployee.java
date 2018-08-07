package henu.chinaboy.xb.Observer;

/**
 * 看NBA直播的员工类
 */
public class WatchNBAEmployee extends OberverObject {
    private boolean notifyStatus = false;// false表示还没通知到

    public WatchNBAEmployee(String name){
        this.name = name;
        System.out.println(name+"正在看NBA直播!");
    }

    public void StopWatchingNBA(String message){
        notifyStatus = true;
        System.out.println(name+"收到消息:"+message+","+name+"马上停止了看NBA !");
    }

    public void BossComing(){
        if(!notifyStatus)
            System.out.println(name+"没有发现老板到跟前了，被老板发现正在看NBA了");
        else
            System.out.println(name+"在老板到达之前已经关闭了NBA直播，嘿嘿!");
    }
}

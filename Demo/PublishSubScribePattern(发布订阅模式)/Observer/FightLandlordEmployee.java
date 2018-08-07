package henu.chinaboy.xb.Observer;

/**
 * 打斗地主的员工类
 */
public class FightLandlordEmployee extends OberverObject{
    private boolean notifyStatus = false;// false表示还没通知到

    public FightLandlordEmployee(String name){
        this.name = name;
        System.out.println(name+"正在看斗地主!");

    }

    public void StopFightingLandlord(String message){
        notifyStatus = true;
        System.out.println(name+"收到消息:"+message+","+name+"马上停止了斗地主了 !");
    }
    public void BossComing(){
        if(!notifyStatus)
            System.out.println(name+"没有发现老板到跟前了，被老板发现正在斗地主了");
        else
            System.out.println(name+"在老板到达之前已经关闭了斗地主游戏，嘿嘿!");
    }
}

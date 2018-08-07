package henu.chinaboy.xb;

import henu.chinaboy.xb.NotifyObject.Boss;
import henu.chinaboy.xb.NotifyObject.DeskSecretary;
import henu.chinaboy.xb.Observer.FightLandlordEmployee;
import henu.chinaboy.xb.Observer.WatchNBAEmployee;

/**
 * 发布订阅模式Demo，经典的发布订阅会存在通知者依赖订阅者的情况，但是这个Demo利用了类似C#中的委托的方式，将具体类的操作再进一步抽象，从而回避了这种依赖
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        // 有四个员工都在忙中偷闲
        WatchNBAEmployee one = new WatchNBAEmployee("小明");
        WatchNBAEmployee two = new WatchNBAEmployee("小浩");
        FightLandlordEmployee three = new FightLandlordEmployee("大志");
        FightLandlordEmployee four = new FightLandlordEmployee("老唐");

        // Boss抵达办公室，但是还没进入"危险区域"，但是四人已经出现在了Boss的视野中
        Boss b = new Boss();
        b.addListener(one,"BossComing",null);
        b.addListener(two,"BossComing",null);
        b.addListener(three,"BossComing",null);
        b.addListener(four,"BossComing",null);

        // 前台助理上线，可以帮忙监视老板动向
        DeskSecretary d = new DeskSecretary();
        d.addListener(one,"StopWatchingNBA","老板来了!");// 小明找了前台助理帮忙
        d.addListener(three,"StopFightingLandlord","老板来了!");// 大志找了前台主力帮忙

        // 小浩和老唐被老板抓到了，但是小明和大志没有
        d.notifyAllListener();
        b.notifyAllListener();
    }
}

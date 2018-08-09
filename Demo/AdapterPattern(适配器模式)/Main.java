package henu.chinaboy.xb;

import henu.chinaboy.xb.Players.Center;
import henu.chinaboy.xb.Players.CenterAdapter;
import henu.chinaboy.xb.Players.Forward;

/**
 * 适配器模式，适用于子系统与调用子系统的顶层模块解耦
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        Forward f = new Forward("麦迪");
        Center c = new Center("霍华德");
        CenterAdapter fc = new CenterAdapter("姚明");
        f.attack();
        c.attack();
        fc.attack();
    }
}

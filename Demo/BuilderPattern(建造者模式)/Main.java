package henu.xb;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 顾客进店
        // 发现老板和汽车制造人员A和B
        Director d = new Director();
        CarBuilder a = new SportCarBuilder();
        CarBuilder b = new TruckBuilder();
        // 顾客想要建造一部跑车
        CarProduct c1 = d.Construct(a);// 老板让跑车制造人员做了跑车一部
        // 顾客还想要一部卡车
        CarProduct c2 = d.Construct(b);// 老板让卡车制作人员做了卡车一部
        // 顾客心满意足的走了!
    }
}

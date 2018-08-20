package henu.xb;

import java.util.ArrayList;
import java.util.List;

public class CarProduct {
    private String name;
    List<String> parts = new ArrayList<>();

    public CarProduct(String name){
        this.name =name;
        System.out.println(name+"开始构建..");
    }

    public void addPart(String partName){
        parts.add(partName);
        System.out.println(String.format("由%s组成",partName));
    }
}

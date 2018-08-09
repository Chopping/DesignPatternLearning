package henu.chinaboy.xb.Players;

import henu.chinaboy.xb.AdpaterPart.ForeignCenter;

public class CenterAdapter extends Player {
    private ForeignCenter fc;
    public CenterAdapter(String name){
        fc = new ForeignCenter(name);
    }
    @Override
    public void attack() {
        fc.ForeignAttack();
    }

    @Override
    public void defend() {
        fc.ForeignDefend();
    }
}

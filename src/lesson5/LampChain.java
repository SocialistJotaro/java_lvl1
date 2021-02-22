package lesson5;

import java.util.ArrayList;
import java.util.List;

public class LampChain {
    private List<Lamp> chain;

    public LampChain(){
        chain = new ArrayList<>();
    }

    public boolean check (){
        boolean flag = true;
        for (Lamp lamp:
             chain) {
            flag &= lamp.isOn();
        }
        return flag;
    }
}

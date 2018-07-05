/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

import java.util.Random;

/**
 *
 * @author Wout
 */
public class Aegislash extends Pokemon{@Override
    public String getName() {
        return "Aegislash";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Steel();
        else
            return new Ghost();
    }

    @Override
    public double getTier() {
        return 6 + (5/12);
    }
    
    @Override
    public double getBase() {
        return 520;
    }
}

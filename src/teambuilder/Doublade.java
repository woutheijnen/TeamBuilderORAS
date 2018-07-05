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
public class Doublade extends Pokemon{@Override
    public String getName() {
        return "Doublade";
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
        return 3;
    }
    
    @Override
    public double getBase() {
        return 448;
    }
}

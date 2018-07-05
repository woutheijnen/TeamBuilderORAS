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
public class Pangoro extends Pokemon{@Override
    public String getName() {
        return "Pangoro";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fighting();
        else
            return new Dark();
    }
    
    @Override
    public double getTier() {
        return 3;
    }
    
    @Override
    public double getBase() {
        return 495;
    }
    
    @Override
    public Ability getAbility() {
        return new Scrappy();
    }
}

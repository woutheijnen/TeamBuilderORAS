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
public class Poliwrath extends Pokemon{@Override
    public String getName() {
        return "Poliwrath";
    }

    @Override
    public Type2 getType(int n) {
        if(n==1)
            return new Water();
        else
            return new Fighting();
    }
    
    @Override
    public double getBase() {
        return 510;
    }
    
    @Override
    public double getTier() {
        return 2;
    }
    
    @Override
    public Ability getAbility() {
        return new WaterAbsorb();
    }
}

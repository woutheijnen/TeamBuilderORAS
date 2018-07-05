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
public class Seismitoad extends Pokemon {
    @Override
    public String getName() {
        return "Seismitoad";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Water();
        else
            return new Ground();
    }
    
    @Override
    public double getBase() {
        return 509;
    }
    
    @Override
    public Ability getAbility() {
        return new WaterAbsorb();
    }
}

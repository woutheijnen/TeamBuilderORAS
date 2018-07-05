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
public class Parasect extends Pokemon{@Override
    public String getName() {
        return "Parasect";
    }

    @Override
    public Type2 getType(int n) {
        if(n==1)
            return new Bug();
        else
            return new Grass();
    }
    
    @Override
    public double getBase() {
        return 405;
    }
    
    @Override
    public Ability getAbility()
    {
        return new DrySkin();
    }
}

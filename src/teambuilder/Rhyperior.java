/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teambuilder;

/**
 *
 * @author Wout
 */
public class Rhyperior extends Pokemon {
    @Override
    public String getName() {
        return "Rhyperior";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Ground();
        else
            return new Rock();
    }
    
    @Override
    public double getTier() {
        return 3;
    }
    
    @Override
    public double getBase() {
        return 535;
    }
    
    @Override
    public Ability getAbility() {
        return new SolidRock(this);
    }
}

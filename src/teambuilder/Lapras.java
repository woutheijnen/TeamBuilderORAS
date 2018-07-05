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
public class Lapras extends Pokemon{
    @Override
    public String getName() {
        return "Lapras";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Water();
        else
            return new Ice();
    }
    
    @Override
    public double getBase() {
        return 535;
    }
    
    @Override
    public Ability getAbility() {
        return new WaterAbsorb();
    }
}

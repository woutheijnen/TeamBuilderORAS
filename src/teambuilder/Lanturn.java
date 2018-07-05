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
public class Lanturn extends Pokemon{
    @Override
    public String getName() {
        return "Lanturn";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Water();
        else
            return new Electric();
    }
    
    @Override
    public double getBase() {
        return 460;
    }
    
    @Override
    public Ability getAbility() {
        return new VoltAbsorb();
    }
}

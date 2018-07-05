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
public class MegaRayquaza extends Pokemon {
@Override
    public String getName() {
        return "Mega Rayquaza";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Dragon();
        else
            return new Flying();
    }
    
    @Override
    public double getTier() {
        return 7;
    }
    
    @Override
    public double getBase() {
        return 780;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public Ability getAbility()
    {
        return new DeltaStream();
    }
    
    @Override
    public int getId()
    {
        return 384;
    }
}

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
public class MegaLatios extends Pokemon {
    @Override
    public String getName() {
        return "Mega Latios";
    }

    @Override
    public Type2 getType(int n
    ) {
        if(n == 1)
            return new Dragon();
        else
            return new PsychicType();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 5;
    }
    
    @Override
    public double getBase() {
        return 700;
    }
    
    @Override
    public int getId()
    {
        return 381;
    }
    
    @Override
    public Ability getAbility() {
        return new Levitate();
    }
}

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
public class MegaAggron extends Pokemon {
    @Override
    public String getName() {
        return "Mega Aggron";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Steel();
        else
            return new NoType2();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public double getTier() {
        return 4;
    }
    
    @Override
    public double getBase() {
        return 630;
    }
    
    @Override
    public int getId()
    {
        return 306;
    }
    
    @Override
    public Ability getAbility()
    {
        return new Filter(this);
    }
}

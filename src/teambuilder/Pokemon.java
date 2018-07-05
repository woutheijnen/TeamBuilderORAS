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
public abstract class Pokemon {
    public abstract String getName();
    
    public abstract Type2 getType(int n);
    
    public Boolean isMega()
    {
        return false;
    }
    
    public double getTier()
    {
        return 2;
    }
    
    public abstract double getBase();
    
    public Boolean isBanned()
    {
        return false;
    }
    
    public int getId()
    {
        return 0;
    }
    
    public Ability getAbility()
    {
        return new NoSpecialAbility();
    }
}

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
public class MegaVenusaur extends Pokemon{

    @Override
    public String getName() {
        return "Mega Venusaur";
    }

    @Override
    public Type2 getType(int n) {
        if(n==1)
            return new Grass();
        else
            return new Poison();
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public Ability getAbility()
    {
        return new ThickFat();
    }
    
    @Override
    public double getTier() {
        return 5;
    }
    
    @Override
    public double getBase() {
        return 625;
    }
    
    @Override
    public int getId()
    {
        return 3;
    }
}

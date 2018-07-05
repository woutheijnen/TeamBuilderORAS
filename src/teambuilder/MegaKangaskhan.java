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
public class MegaKangaskhan extends Pokemon{@Override
    public String getName() {
        return "Mega Kangaskhan";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Normal();
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
        return 6 + (6/12);
    }
    
    @Override
    public double getBase() {
        return 590;
    }
    
    @Override
    public int getId()
    {
        return 115;
    }
    
    @Override
    public Ability getAbility() {
        return new Scrappy();
    }
}

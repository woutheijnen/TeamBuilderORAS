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
public class MegaDiancie extends Pokemon{
    @Override
    public String getName() {
        return "Mega Diancie";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Fairy();
        else
            return new Rock();
    }
    
    @Override
    public double getTier() {
        Random r = new Random();
        if(r.nextBoolean())
            return 5;
        else
            return 6 + (7/12);
    }
    
    @Override
    public double getBase() {
        return 700;
    }
    
    @Override
    public Boolean isMega()
    {
        return true;
    }
    
    @Override
    public Boolean isBanned()
    {
        return true;
    }
    
    @Override
    public int getId()
    {
        return 719;
    }
}

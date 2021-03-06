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
public class MegaSlowbro extends Pokemon {
    @Override
    public String getName() {
        return "Mega Slowbro";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Water();
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
        Random r = new Random();
        if(r.nextBoolean())
            return 5;
        else
            return 6 + (3/12);
    }
    
    @Override
    public double getBase() {
        return 590;
    }
    
    @Override
    public int getId()
    {
        return 80;
    }
}

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
public class Latias extends Pokemon{
    @Override
    public String getName() {
        return "Latias";
    }

    @Override
    public Type2 getType(int n) {
        if(n == 1)
            return new Dragon();
        else
            return new PsychicType();
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
        return 600;
    }
    
    @Override
    public int getId()
    {
        return 380;
    }
    
    @Override
    public Ability getAbility() {
        return new Levitate();
    }
}
